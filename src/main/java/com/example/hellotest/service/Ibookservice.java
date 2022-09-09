package com.example.hellotest.service;

import com.example.hellotest.entity.booklist;
import java.util.List;

public interface Ibookservice {
    //添加book
    void add(booklist book);
    //更新book
    void edit(booklist book);
    //删除book
    void delete(int id);
    //根据ID获取book
    booklist getById(int id);
    //根据出版社获取book
    List<booklist> getByPublish(String publish);
    //根据名称获取book
    List<booklist> getByBname(String B_name);
    //根据类别获取book
    List<booklist> getByClassify(String Classify);
    //找到所有
    List<booklist> findALL();
}
