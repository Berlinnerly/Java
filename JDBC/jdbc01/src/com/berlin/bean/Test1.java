package com.berlin.bean;

/**
 * @Author Berlin
 * @Date 2021/1/10 8:15 星期日
 * @Description ORM编程思想（object relational mapping）
 *
 * 一个数据表对应一个Java类
 * 表中的一条记录对应了Java类的一个对象
 * 表中的一个字段对应了Java的一个属性
 */
public class Test1 {

    private int id;
    private String username;
    private String password;

    public Test1(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Test1() {
    }

    @Override
    public String toString() {
        return "Test1{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
