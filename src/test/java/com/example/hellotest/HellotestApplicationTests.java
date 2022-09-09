package com.example.hellotest;

import com.example.hellotest.dao.booklistMapper;
import com.example.hellotest.entity.booklist;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = HellotestApplication.class)
@RunWith(SpringRunner.class)
class HellotestApplicationTests {
    @Autowired
    private booklistMapper dao;
    @Test
    void contextLoads() {
        booklist a=dao.selectByPrimaryKey(1);
        /*for(booklist book:a){
            System.out.println(book.getbId());
            System.out.println(book.getbName());
            System.out.println(book.getbSummary());
            System.out.println(book.getClassify());
            System.out.println(book.getData());
            System.out.println(book.getPublish());
        }*/
        /*booklist book = new booklist();
        book.setbId(1);
        book.setbName("test");
        book.setbSummary("Is a 测试");
        book.setClassify("测试");
        book.setData("2020:2:19");
        book.setPublish("LWZ");
        dao.insert(book);*/
    }

}
