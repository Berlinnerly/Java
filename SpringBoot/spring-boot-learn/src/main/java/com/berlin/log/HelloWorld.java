package com.berlin.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Berlin
 * @date 2021/3/4 10:23
 * @description
 */
public class HelloWorld {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.info("Hello World");
    }
}
