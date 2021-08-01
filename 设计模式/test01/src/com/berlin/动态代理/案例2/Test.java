package com.berlin.动态代理.案例2;

/**
 * @author Berlin
 * @date 2021/1/22 9:47
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        MathImp math = new MathImp();
//        int result = math.add(1, 2);
//        System.out.println(result);

        ProxyUtils proxyUtils = new ProxyUtils(new MathImp());
        MathI proxy = (MathI) proxyUtils.getProxy();
        int add = proxy.add(1, 1);
        System.out.println(add);
    }
}
