package com.berlin;

import com.berlin.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootLearnApplicationTests {

    @Autowired
    Person person;

    // 通过日志记录器工厂返回一个日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
//        System.out.println(person);
//        logger.trace("这是trace日志");
//        logger.debug("这是debug日志");
//        logger.info("这是info日志");
//        logger.warn("这是警告日志");
//        logger.error("这是错误日志");
    }

}
