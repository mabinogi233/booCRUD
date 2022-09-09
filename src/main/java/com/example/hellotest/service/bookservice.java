package com.example.hellotest.service;

import com.example.hellotest.dao.booklistMapper;
import com.example.hellotest.entity.booklist;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookservice implements Ibookservice {

    @Autowired
    private booklistMapper bookMapper;

    @Override
    public void add(booklist customer) {
        bookMapper.insert(customer);
    }

    @Override
    public void edit(booklist customer) {
        bookMapper.updateByPrimaryKey(customer);
    }

    @Override
    public void delete(int id) {
        bookMapper.deleteByPrimaryKey(id);
    }

    @Override
    public booklist getById(int id) {
        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    //根据出版社获取book
    public List<booklist> getByPublish(String publish){
        return bookMapper.getByPublish(publish);
    }

    @Override
    //根据名称获取book
    public List<booklist> getByBname(String B_name){
        return bookMapper.getByBname(B_name);
    }

    @Override
    //根据类别获取book
    public List<booklist> getByClassify(String Classify){
        return bookMapper.getByClassify(Classify);
    }

    @Override
    public List<booklist> findALL(){
        return bookMapper.findAll();
    }
}
