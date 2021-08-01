package com.berlin.conf;

import com.berlin.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Berlin
 * @date 2021/3/4 9:59
 * @description
 */

// 指名当前类是一个配置类，用来代替Spring的配置文件
@Configuration
public class MyApplication {

    /**
     * 将方法的返回值添加到容器中，容器中这个组件的默认ID就是方法名
     * @return
     */
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
