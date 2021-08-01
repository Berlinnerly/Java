package com.berlin.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Berlin
 * @date 2021/1/27 12:40
 * @description
 */

@Service
@Transactional
public class CashierServiceImpl implements Cashier{

    @Autowired
    private BookService service;

    @Override
    public void checkOut(String uid, List<String> bids) {
        for (String bid :
                bids) {
            service.buyBook(bid, uid);
        }
    }
}
