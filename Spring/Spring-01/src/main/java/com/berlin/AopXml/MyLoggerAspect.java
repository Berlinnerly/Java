package com.berlin.AopXml;

import org.springframework.stereotype.Component;

/**
 * @author Berlin
 * @date 2021/1/27 0:18
 * @description
 */

@Component
public class MyLoggerAspect {

    public void before() {
        System.out.println("前置通知");
    }
}
