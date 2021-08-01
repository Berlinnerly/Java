package javajichu;

public class ArrayTool2 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 87, 46, 47, 4, 45676, 46, 7, 464, 79, 74, 56479, 7};
        //ArrayTool at = new ArrayTool();           //构造方法私有，不能创建对象
//        int max = at.getMax(arr);
//        System.out.println(max);

        ArrayTool.getMax(arr);

        System.out.println("-----------------------------------");

        ArrayTool.print(arr);
        System.out.println();

        System.out.println("-----------------------------------");

        ArrayTool.revArray(arr);
        ArrayTool.print(arr);
    }
}
