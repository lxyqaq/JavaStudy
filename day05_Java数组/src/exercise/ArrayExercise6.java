package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 14:08
 */
public class ArrayExercise6 {
    public static void main(String[] args) {
        /*
         * 使用简单数组
        (1)创建一个名为ArrayExercise6的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
        (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
        (3)显示array1的内容。
        (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值(如array[0]=0,array[2]=2)。打印出array1。
         *
         * 思考：array1和array2是什么关系？array1和array2地址值相同，都指向了堆空间的唯一的一个数组实体。
         * 拓展：修改题目，实现array2对array1数组的复制--ArrayExercise7.java
         */

        int[] array1, array2;
        array1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        System.out.print("array1数组为：");
        //遍历数组
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

        //赋值array2变量等于array1,地址值赋值，有一个new堆中就一个数组
        //不能称作数组的复制。
        array2 = array1;

        for (int i = 0; i < array2.length; i++) {
            if (i % 2 == 0) {
                array2[i] = i;
            }
        }

        //换行
        System.out.println();

        //打印array1
        System.out.print("array1数组为：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }

    }
}
