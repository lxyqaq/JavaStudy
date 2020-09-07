package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 14:37
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        /*
         * 算法的考查：数组的复制、反转、查找(线性查找、二分法查找)
         *
         *
         */

        String[] array1 = new String[]{"aa", "bb", "cc", "dd", "ee", "ff"};

        //数组的复制
        String[] array2 = new String[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + "\t");
        }

        System.out.println();

        //数组的反转
        for (int i = 0; i < (array1.length / 2); i++) {
            String temp = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = temp;
        }
        //遍历
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

    }
}
