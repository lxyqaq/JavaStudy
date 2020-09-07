package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 19:42
 */
public class BubbleSortTest {
    public static void main(String[] args) {

        //冒泡排序
        int[] array = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
        //遍历排序前的数组
        System.out.print("排序前的数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }

        //排序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        //换行
        System.out.println();

        //排序后的数组
        System.out.print("排序后的数组：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }


    }
}
