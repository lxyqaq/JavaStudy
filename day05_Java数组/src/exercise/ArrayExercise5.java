package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 13:00
 */
public class ArrayExercise5 {
    public static void main(String[] args) {
        /*
         * 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
         *
         * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
         * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
         * 要求：所有随机数都是两位数。
         *
         * [10,99]
         * 公式：(int)(Math.random() * (99 - 10 + 1) + 10)
         *
         */

        //定义数组
        int[] array = new int[10];

        //给数组赋值
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }

        //遍历
        System.out.println("数组中的元素为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        //换行
        System.out.println();

        //求出最大值
        int maxValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        System.out.println("最大值为：" + maxValue);

        //求出最小值
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("最小值为：" + minValue);

        //求和
        int sumValue = array[0];
        for (int i = 0; i < array.length; i++) {
            sumValue += array[i];
        }
        System.out.println("总和为：" + sumValue);

        //求平均值
        int avgValue = array[0];
        for (int i = 0; i < array.length; i++) {
            avgValue = (sumValue / array.length);
        }
        System.out.println("平均值为：" + avgValue);


    }
}
