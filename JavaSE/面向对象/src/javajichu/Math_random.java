package javajichu;
public class Math_random {
    public static void main(String[] args) {
        //Math.random()会随机生成一个大于等于0.0小于1.0的伪随机数
//        double d = Math.random();
//        System.out.println(d);

        //生成十个随机数
        for (int i= 0 ; i< 10;i++) {
            System.out.println(Math.random());
        }

        //生成十个1-100的随机数
        for (int i =0;i < 10;i++) {
            System.out.println((int)(Math.random() * 100) + 1);
        }
    }
}
