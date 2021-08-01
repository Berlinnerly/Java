package com.Berlin.zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author Berlin
 * @Date 2021/1/8 23:21 星期五
 * @Description 自定义注解
 */
public class Test03 {
    // 注解可以显示赋值，如果没有默认值，就必须给注解赋值
    @MyAnnotation2(name1 = "123", age = 18)
    public void test1() {
    }

    @MyAnnotation3("berlin")
    public void test2() {}
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    // 注解的参数：参数类型 + 参数名（）；
    String name1() default "";
    int age();
    int id() default 0;
    String[] schools() default {"外事", "清华"};
}

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    // 只有一个参数时建议使用value，使用时可以不写参数名
    String value();
}
