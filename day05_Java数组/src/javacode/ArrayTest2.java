package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/6 - 22:36
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        /*
         * ⑤ 数组元素的默认初始化值
         * 		> 数组元素是整型：0
         * 		> 数组元素是浮点型：0.0
         * 		> 数组元素是char型：0或'\u0000'，而非'0'
         * 		> 数组元素是boolean型：false
         *
         * 		> 数组元素是引用数据类型：null
         *
         *  ⑥ 数组的内存解析
         */

        int[] array1 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("整形数组默认初始化值为：" + array1[i]);
        }

        double[] array2 = new double[4];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("浮点型数组默认初始化值为：" + array2[i]);
        }

        char[] array3 = new char[4];
        for (int i = 0; i < array3.length; i++) {
            System.out.println("char型数组默认初始化值为：" + array3[i]);
        }

        boolean[] array4 = new boolean[4];
        for (int i = 0; i < array4.length; i++) {
            System.out.println("布尔类型数组默认初始化值为：" + array4[i]);
        }


        String[] array5 = new String[4];
        for (int i = 0; i < array5.length; i++) {
            System.out.println("string类型数组默认初始化值为：" + array5[i]);
        }



    }
}
