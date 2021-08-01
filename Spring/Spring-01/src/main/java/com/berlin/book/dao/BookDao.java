package com.berlin.book.dao;

/**
 * @author Berlin
 * @date 2021/1/27 10:35
 * @description
 */
public interface BookDao {
    Integer selectPrice(String bid);

    void updateSt(String bid);

    void updateBalance(String uid, Integer price);
}
