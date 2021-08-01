package generic;

/**
 * @author Berlin
 * @Time 2020/10/28 9:05
 */

/*
        泛型接口：
            把泛型定义在接口上
            定义格式：
                public interface 接口名<泛型类型>
            泛型接口的使用
 */
public class Fanxingjiekou {
    public static void main(String[] args) {

    }
}

interface Inter<T> {
    void show(T t);
}

class demo implements Inter<String> {           //推荐使用这种
    @Override
    public void show(String t) {
        System.out.println(t);
    }
}

//class demo<T> implements Inter<T> {           //没有必要在实现接口的时候给自己增加泛型
//    @Override
//    public void show(T t) {
//        System.out.println(t);
//    }
//}
