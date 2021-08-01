public class 循环结构 {
    public static void main(String[] args) {
        System.out.println(123);
        /*
        循环结构的分类：for , while, do...while
        for循环格式：
        for(初始化表达式；条件表达式；循环后的操作表达式) {
            循环体；
        }
         */
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Hello,World");
//        }

//        //输出1-10
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }


//        //输出10-1
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }

/*
注意事项：1.判断条件语句不论是简单还是复杂，结果都必须是boolean类型；
 */

//        //求1-10之间的数据之和
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);

        //求1-100中偶数的和；
//        int sum = 0;
//        for (int i = 1; i <= 100; i ++) {
//                if (i % 2 == 0) {
//                    sum = sum +i;
//                }
//        }
//        System.out.println(sum);


        //求1-100中奇数的和
//       int sum = 0;
//       for (int i = 1;i <= 100; i++) {
//           if (i % 2 == 1) {
//               sum = sum +i;
//           }
//       }
//       System.out.println(sum);


//        int sum = 0;
//        for (int i = 1;i <= 100; i+=2) {
//            if (i % 2 == 1) {
//                sum = sum +i;
//            }
//        }
//        System.out.println(sum);


        //输出水仙花数：一个三位数，各位数的立方和等于他本身

//        for (int i = 100; i <= 999; i++) {
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i /10 / 10 % 10;
//            if (ge * ge * ge + shi * shi * shi + bai * bai *bai == i) {
//                System.out.println(i);
//            }
//        }


        /*
        While语句
        初始化表达式；
        While（判断条件语句） {
            循环体语句；
            控制条件语句；
        }
         */

//       int x = 1;
//       while (x <= 10) {
//           System.out.println(x);
//           x++;
//       }

        //使用while语句求1-100的和
//        int sum = 0;
//        int i = 1;
//        while (i <= 100) {
//            sum = sum +i;
//            i++;
//        }
//        System.out.println(sum);


        //使用while语句求水仙花的个数
//        int count = 0;
//        int i = 100;
//        while (i <= 999) {
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 10 / 10 % 10;
//            if (i == ge * ge * ge + shi * shi * shi + bai * bai *bai) {
//                count = count + 1;
//            }
//            i++;
//        }
//        System.out.println(count);


        //do...while语句

        /*
        do {
        循环体语句；
        控制条件语句；
        } while （判断条件语句）；
         */

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);


        //do while至少要执行一次循环体，for 和 while循环先判断条件再决定是否执行循环体
        //for语句执行后变量会被释放，不能再使用
        //while语句执行后初始化变量还可以继续使用


        //死循环
//        while (true) {
//            System.out.println("hello world");
//        }


//        for (;;) {
//            System.out.println("hello world");
//        }


//        //使用for循环打印4行5列的*
//        for (int i = 1 ; i <= 4; i++) {             //外循环
//            for (int j = 1 ; j <= 5 ; j++) {        //内循环
//                System.out.print('*');
//            }
//            System.out.println();       //在内循环结束之后换行
//        }


        //九九乘法表
//        for (int i = 1; i <= 9; i++) {              //外循环
//            for (int j = 1; j <= i; j++) {          //内循环
//                System.out.print(j + "*" + i + "=" + (i * j) + '\t');
//            }
//            System.out.println();
//        }


        //break的使用场景
        //break只能在switch和循环中使用
//        for (int i = 1; i <= 10; i++) {
//            if (i == 4) {
//                break;                      //跳出循环
//            }
//            System.out.println(i);
//        }


        //continue只能在循环中使用
//        for (int i = 1; i <= 10; i++) {
//            if (i == 4) {
//                continue;                      //终止本次循环，开始下次循环
//            }
//            System.out.println(i);
//        }


        //使用标号可以跳出指定循环
//        outer :for (int i = 1; i <= 10; i++) {          //只要是合法的标识符即可
//            System.out.println(i);
//            b :for (int j = 1; j <= 10; j++) {
//                System.out.println(j);
//                break outer;
//            }
//        }
    }
}
