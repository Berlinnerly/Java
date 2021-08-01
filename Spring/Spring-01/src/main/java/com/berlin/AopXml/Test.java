package com.berlin.AopXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Berlin
 * @date 2021/1/27 0:25
 * @description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("conf/aop-xml.xml");
        MathI mathImpl = ac.getBean("mathImpl", MathI.class);
        int add = mathImpl.add(1, 2);
        System.out.println(add);
    }
}
