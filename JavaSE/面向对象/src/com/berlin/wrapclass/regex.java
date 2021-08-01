package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/22 16:22
 */

/*
    校验QQ号：
        1.必须是5-15位数字；
        2.0不能开头；
        3.必须都是数字；
    非正则表达式实现
    正则表达式实现

    返回值类型：Boolean
    参数列表：String QQ
 */
public class regex {
    public static void main(String[] args) {
        String qq = "1234561231313132132131313123";
//        Boolean b = checkQQ(qq);
//        System.out.println(b);

        String regex = "[1-9]\\d{4,14}";
        System.out.println("123456".matches(regex));        //matches判断字符串是否符合给定的正则表达式
    }

    public static boolean checkQQ(String qq) {
        boolean flag = true;            //如果校验不符合要求就把flag置为false，符合直接返回flag
        if (qq.length() >= 5 && qq.length() <= 15) {
            if (!qq.startsWith("0")) {
                char[] arr = qq.toCharArray();      //将字符串转换成字符数组
                for (int i = 0;i < qq.length();i++) {
                    char c = arr[i];            //记录每一个字符
                    if (!(c >= '0' && c <= '9')) {
                        flag = false;           //说明不是纯数字
                        System.out.println("不是纯数字");
                        break;
                    }
                }
            }else {
                flag = false;               //以0开头
                System.out.println("以0开头");
            }
        } else {
            flag = false;                   //长度不符合
            System.out.println("长度不符合");
        }
        return flag;
    }
}
