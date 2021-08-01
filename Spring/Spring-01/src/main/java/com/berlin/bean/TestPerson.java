package com.berlin.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Berlin
 * @date 2021/1/26 16:15
 * @description
 */
public class TestPerson {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/applicationContext.xml");
        Person person1 = ac.getBean("person1", Person.class);
        System.out.println(person1);

//        Person person2 = ac.getBean("person2", Person.class);
//        System.out.println(person2);

//        Person person3 = ac.getBean("person3", Person.class);
//        System.out.println(person3);
    }
}
