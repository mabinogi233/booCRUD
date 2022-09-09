package com.example.hellotest.controller;

import com.example.hellotest.entity.booklist;
import com.example.hellotest.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/AdmBook")
public class AdmController {

    @Autowired
    private bookservice bookService;

    @RequestMapping("listall")
    public String listall(ModelMap map){
        map.addAttribute("books",bookService.findALL());
        return "list";
    }

    @ResponseBody
    @RequestMapping("del")
    public String del(ModelMap map, @RequestParam(defaultValue = "0") int id){
        bookService.delete(id);
        return "success";
    }

    @RequestMapping("edit")
    public String edit(ModelMap map, @RequestParam(defaultValue = "0") int id){
        //isAdd : 向前端页面返回一个是新增与编辑的标识
        if(id > 0){
            map.addAttribute("isAdd",false);
            map.addAttribute("book",bookService.getById(id));
        }else{//新增
            map.addAttribute("isAdd",true);
            map.addAttribute("book",new booklist());
        }
        return "edit";
    }

    //新增和编辑
    @ResponseBody
    @RequestMapping("save")
    public String save(@ModelAttribute booklist book){
        if(book == null){
            return "fail";
        }
        if(book.getbId() != null && book.getbId() > 0){
            bookService.edit(book);
        }else{
            book.setbId((bookService.findALL().size())+1);
            bookService.add(book);
        }
        return "success";
    }

}
