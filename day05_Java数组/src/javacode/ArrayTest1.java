package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/6 - 22:06
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        /*
         * 一、数组的概述
         * 1.数组的理解：数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
         * 并通过编号的方式对这些数据进行统一管理。
         *
         * 2.数组相关的概念：
         * >数组名
         * >元素
         * >角标、下标、索引
         * >数组的长度：元素的个数
         *
         * 3.数组的特点：
         * 1）数组是有序排列的
         * 2）数组属于引用数据类型的变量。数组的元素，既可以是基本数据类型，也可以是引用数据类型
         * 3）创建数组对象会在内存中开辟一整块连续的空间
         * 4）数组的长度一旦确定，就不能修改。
         *
         * 4. 数组的分类：
         *   ① 按照维数：一维数组、二维数组、。。。
         *   ② 按照数组元素的类型：基本数据类型元素的数组、引用数据类型元素的数组
         *
         * 5. 一维数组的使用
         *   ① 一维数组的声明和初始化
         *   ② 如何调用数组的指定位置的元素
         *   ③ 如何获取数组的长度
         *   ④ 如何遍历数组
         *   ⑤ 数组元素的默认初始化值 ：见ArrayTest1.java
         *   ⑥ 数组的内存解析 ：见ArrayTest1.java
         */

        //1. 一维数组的声明和初始化

        //1.1 静态初始化:数组的初始化和数组元素的赋值操作同时进行
        int[] array1;
        array1 = new int[]{1, 2, 3};
        System.out.println("array1的数组长度为：" + array1.length);

        int[] array2 = new int[]{1, 2, 3, 4};
        System.out.println("array2的数组长度为：" + array2.length);

        //1.2动态初始化:数组的初始化和数组元素的赋值操作分开进行
        int[] array3 = new int[5];
        array3[0] = 1;
        array3[1] = 2;
        array3[2] = 3;
        array3[3] = 4;
        array3[4] = 5;
        System.out.println("array3的数组长度为：" + array3.length);

        //如何遍历数组
        //使用for循环
        for (int i = 0; i < array3.length; i++) {
            System.out.print("array3数组遍历：" + array3[i]);
        }


    }
}
