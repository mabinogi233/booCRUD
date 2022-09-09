package com.example.hellotest.controller;

import com.example.hellotest.entity.booklist;
import com.example.hellotest.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

@Controller
@RequestMapping("/booklist")
public class bookController {

    @Autowired
    private bookservice bookService;


    @RequestMapping("listall")
    public String listall(ModelMap map){
        map.addAttribute("books",bookService.findALL());
        return "index";
    }
    /*
    @RequestMapping("listpublish")
    public String listByPublish(ModelMap map, @RequestParam String publish){
        map.addAttribute("books",bookService.getByPublish(publish));
        return "listby";
    }

    @RequestMapping("listclassify")
    public String listByClassify(ModelMap map, @RequestParam String classify){
        map.addAttribute("books",bookService.getByClassify(classify));
        return "listby";
    }*/

    @RequestMapping("listbname")
    public String listByBname(ModelMap map, @RequestParam(value="bname",required=false) String bname){
        map.addAttribute("books",bookService.getByBname(bname));
        return "searchBook";
    }

    @RequestMapping("/download")
    @ResponseBody
    public String download(HttpServletResponse response, @RequestParam("filename") String filename){
        filename = filename+".txt";
        File file = new File("/root/PDFbook/" + filename);
        if (!file.exists()) {
            return "file not exist";
        }
        try {
            //这行代码主要用于解决文件名为中文是，下载显示文件名乱码
            filename = URLEncoder.encode(filename, "UTF-8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.reset();
        response.setHeader("Content-Disposition", "attachment;fileName=\"" + filename + "\"");
        try {
            InputStream inStream = new FileInputStream(file);
            OutputStream os = response.getOutputStream();

            byte[] buff = new byte[1024];
            int len = -1;
            while ((len = inStream.read(buff)) > 0) {
                os.write(buff, 0, len);
            }
            os.flush();
            os.close();
            inStream.close();
        } catch (Exception e) {
            e.printStackTrace();
            return "装换成输出流出错";
        }
        return "正在下载";
    }

}


