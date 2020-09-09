package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/9 - 22:27
 */
public class ArrayUtil {
    /*
     * 自定义数组的工具类
     *
     */


    //求数组最大值
    public int getMax(int[] array) {
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    //求数组最小值
    public int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    //求数组总和
    public int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //求数组平均值
    public int getAvg(int[] array) {
        return getSum(array) / array.length;
    }

    //反转数组
    public void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    //反转数组(重载)
    public void reverse(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] array) {
        int[] array1 = new int[array.length];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array[i];
        }
        return array1;
    }

    //交换数组中指定两个位置元素的值
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //冒泡排序
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    //遍历数组
    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    // 查找指定元素
    public int getIndex(int[] array, int dest) {
        // 线性查找：

        for (int i = 0; i < array.length; i++) {

            if (dest == array[i]) {
                return i;
            }

        }

        return -1;//返回一个负数，表示没有找到
    }
}
