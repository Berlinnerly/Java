package com.berlin.jdbcTemplate;

/**
 * @author Berlin
 * @date 2021/1/27 1:06
 * @description
 */
public class Emp {
    private Integer eid;
    private String ename;
    private Integer age;
    private String sex;

    public Emp(Integer eid, String ename, Integer age, String sex) {
        this.eid = eid;
        this.ename = ename;
        this.age = age;
        this.sex = sex;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
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
}
