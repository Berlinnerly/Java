package com.berlin.bean;

/**
 * @author Berlin
 * @date 2021/1/26 13:28
 * @description
 */
public class Dept {
    private Integer did;
    private String dname;

    public Dept(Integer did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    public Dept() {
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
