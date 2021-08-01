package com.berlin.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @author Berlin
 * @date 2021/1/27 0:10
 * @description
 */

@Component
@Aspect
@Order(1)
public class TestAspect {
    @Before("execution(* com.berlin.AOP.*.*(..))")
    public void before() {
        System.out.println("TestAspect==>前置通知");
    }
}
