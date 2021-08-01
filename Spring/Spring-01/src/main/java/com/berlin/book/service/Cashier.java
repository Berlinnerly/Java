package com.berlin.book.service;

import java.util.List;

/**
 * @author Berlin
 * @date 2021/1/27 12:38
 * @description
 */
public interface Cashier {

    void checkOut(String uid, List<String> bids);
}
