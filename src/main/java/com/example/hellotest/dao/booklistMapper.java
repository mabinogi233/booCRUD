package com.example.hellotest.dao;

import com.example.hellotest.entity.booklist;
import java.util.List;

public interface booklistMapper {
    int deleteByPrimaryKey(Integer bId);

    int insert(booklist record);

    int insertSelective(booklist record);

    booklist selectByPrimaryKey(Integer bId);

    int updateByPrimaryKeySelective(booklist record);

    int updateByPrimaryKey(booklist record);

    List<booklist> findAll();

    List<booklist> getByPublish(String publish);

    List<booklist> getByBname(String bName);

    List<booklist> getByClassify(String classify);

}