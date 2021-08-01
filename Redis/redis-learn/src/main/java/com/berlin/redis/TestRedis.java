package com.berlin.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * @author Berlin
 * @date 2021/3/8 11:20
 * @description
 */
public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);

        // 测试连接
//        String pong = jedis.ping();
//        System.out.println(pong);

        // 测试功能
        String set = jedis.set("k1", "v1");
        System.out.println(set);

        String k1 = jedis.get("k1");
        System.out.println(k1);

        Boolean k3 = jedis.exists("k3");
        System.out.println(k3);

        Set<String> keys = jedis.keys("*");
        System.out.println(keys);

        String set1 = jedis.set("k2", "v2");
        System.out.println(set1);



    }
}
