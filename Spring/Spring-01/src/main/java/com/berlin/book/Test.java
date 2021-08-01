package com.berlin.book;

import com.berlin.book.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Berlin
 * @date 2021/1/27 11:25
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/book.xml");
        BookController controller = ac.getBean("bookController", BookController.class);
//        controller.buyBook();
        controller.checkOut();
    }
}
