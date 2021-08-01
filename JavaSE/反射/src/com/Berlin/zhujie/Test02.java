package com.Berlin.zhujie;

import java.lang.annotation.*;

/**
 * @Author Berlin
 * @Date 2021/1/8 23:09 星期五
 * @Description 测试元注解
 */

@MyAnnotation
public class Test02 {

    @MyAnnotation
    public void test() {

    }
}

/**
 * Target   表示注解在哪些地方可以使用
 * Retention    表示在哪些地方还有效
 * Documented   表示是否将注解生成在Javadoc中
 * Inherited    表示子类可以继承父类
 */
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
@interface MyAnnotation{

}
