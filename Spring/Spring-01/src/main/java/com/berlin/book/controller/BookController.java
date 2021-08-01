package com.berlin.book.controller;

import com.berlin.book.service.BookService;
import com.berlin.book.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Berlin
 * @date 2021/1/27 10:33
 * @description
 */

@Controller
public class BookController {

    @Autowired
    private BookService service;

    @Autowired
    private Cashier cashier;

    public void buyBook() {
        service.buyBook("1", "1001");
    }

    public void checkOut() {
        List<String> bids = new ArrayList<>();
        bids.add("1");
        bids.add("2");
        cashier.checkOut("1001", bids);
    }
}
