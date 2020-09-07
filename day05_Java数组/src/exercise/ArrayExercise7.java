package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 14:20
 */
public class ArrayExercise7 {
    public static void main(String[] args) {
        /*
         * 使用简单数组
         * 拓展：修改题目，实现array2对array1数组的复制
         */

        //定义数组
        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        System.out.print("array1数组为：");
        //遍历数组
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        //换行
        System.out.println();

        //数组的复制
        System.out.print("array2数组为：");
        array2 = new int[array1.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
            System.out.print(array2[i] + "\t");
        }

        System.out.println();

        System.out.print("改变后的array2数组为：");
        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
            System.out.print(array2[i] + "\t");
        }

        //换行
        System.out.println();

        //遍历array1
        System.out.print("改变array2后array1数组为：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }


    }
}
