package javacode;

import java.util.Arrays;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 20:15
 */
public class ArraysToolTest {
    public static void main(String[] args) {

        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等。
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 3, 2, 4};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);

        //2.String toString(int[] a):输出数组信息。
        String shuChu = Arrays.toString(arr1);
        System.out.println(shuChu);
        System.out.println(Arrays.toString(arr2));

        //3.void fill(int[] a,int val):将指定值填充到数组之中
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        //4.void sort(int[] a):对数组进行排序。
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //5.int binarySearch(int[] a,int key):使用二分法在指定的int数组中搜索指定的值。
        int[] arr3 = new int[]{-98, -34, 2, 34, 54, 66, 79, 105, 210, 333};
        int index = Arrays.binarySearch(arr3, 105);
        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("没有找到这个值！");
        }

    }
}
