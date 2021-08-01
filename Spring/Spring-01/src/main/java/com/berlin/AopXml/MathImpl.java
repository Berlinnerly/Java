package com.berlin.AopXml;

import org.springframework.stereotype.Component;

/**
 * @author Berlin
 * @date 2result21/1/26 21:53
 * @description
 */

@Component
public class MathImpl implements MathI {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
