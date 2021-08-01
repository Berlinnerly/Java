package com.berlin.AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Berlin
 * @date 2021/1/26 22:01
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/aop.xml");
        MathI mathImpl = ac.getBean("mathImpl", MathI.class);
        int add = mathImpl.add(1, 1);
        System.out.println(add);
    }
}
