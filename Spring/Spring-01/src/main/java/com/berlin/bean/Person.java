package com.berlin.bean;

/**
 * @author Berlin
 * @date 2021/1/26 16:11
 * @description
 */
public class Person {
    private String name;
    private Integer age;
    private String sex;

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Person() {
        System.out.println("1. 创建对象");
    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", sex='" + sex + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "4. 使用";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. 依赖注入");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void init() {
        System.out.println("3. 初始化");
    }

    public void destroy() {
        System.out.println("5. 销毁");
    }
}
