package com.berlin.bean;

/**
 * @author Berlin
 * @date 2021/2/5 9:26
 * @description
 */
public class User {
    private String username;
    private String password;
    private String email;
    private Integer age;

    private Address address;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
