package com.berlin.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Berlin
 * @date 2021/1/26 21:57
 * @description
 */
@Component
@Aspect
// 定义切面的优先级，值越小优先级越高，默认值为int的最大值
@Order(2)
public class MyAspect {

    /**
     * 定义公共的切入点表达式
     */
    @Pointcut("execution(* com.berlin.AOP.*.*(..))")
    public void test() {}

    /**
     * @param joinPoint
     * @Before 将方法标识为前置通知，在方法执行之前执行
     */
//    @Before("execution(public int com.berlin.AOP.MathImpl.add(int, int ))")
    // 匹配所有的方法
    @Before("test()")
    public void beforeMethod(JoinPoint joinPoint) {
//        System.out.println("方法执行之前");
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("method:" + name + ", args:" + Arrays.toString(args));
    }


    /**
     * @After 将方法标识为后置通知，作用于方法的finally语句块，不管有没有异常，都会执行
     */
//    @After("execution(* com.berlin.AOP.*.*(..))")
    @After("test()")
    public void afterMethod() {
        System.out.println("后置通知");
    }

    /**
     * @AfterReturning 将方法标注为返回通知，作用于方法执行之后
     * @param joinPoint
     * @param result 接收方法的返回值
     */
//    @AfterReturning(value = "execution(* com.berlin.AOP.*.*(..))", returning = "result")
    @AfterReturning(value = "test()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("methodName = " + methodName + ", result = " + result);
    }


    /**
     * @AfterThrowing 将方法标注为异常通知（例外通知），作用于方法抛出异常时
     * @param ex 接收方法返回的异常
     */
//    @AfterThrowing(value = "execution(* com.berlin.AOP.*.*(..))", throwing = "ex")
    @AfterThrowing(value = "test()", throwing = "ex")
    public void afterThrowingMethod(ArithmeticException ex) {
        System.out.println("有异常了，message = " + ex);
    }

    /**
     * @Around 环绕通知
     * @param joinPoint
     * @return
     */
//    @Around("execution(* com.berlin.AOP.*.*(..))")
    @Around("test()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {

        Object result = null;

        try {
            // 执行方法，前置通知
            System.out.println("前置通知");
            joinPoint.proceed();
            // 返回通知
            System.out.println("返回通知");
            return result;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            // 异常通知
            System.out.println("异常通知");
        } finally {
            // 后置通知
            System.out.println("后置通知");
        }
        return -1;
    }
}
