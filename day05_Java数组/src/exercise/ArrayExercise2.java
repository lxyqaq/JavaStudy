package exercise;

import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/6 - 23:06
 */
public class ArrayExercise2 {
    public static void main(String[] args) {
        /*
         * 2. 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
                成绩>=最高分-10    等级为’A’
                成绩>=最高分-20    等级为’B’
                成绩>=最高分-30    等级为’C’
                其余                               等级为’D’

                提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
        *
        */

        //键盘读取学生人数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number = scanner.nextInt();

        //根据人数创建数组
        int[] scores = new int[number];

        //输入学生成绩
        System.out.println("请输入" + number + "个学生成绩：");

        //将成绩加入数组并获取最大值
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
            if (maxScore < scores[i]) {
                maxScore = scores[i];
            }
        }

        //输出学生成绩等级
        char level;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore - 10 <= scores[i]) {
                level = 'A';
            } else if (maxScore - 20 <= scores[i]) {
                level = 'B';
            } else if (maxScore - 30 < +scores[i]) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("第" + (i + 1) + "个学生的分数为：" + scores[i] + "，他的等级为：" + level);
        }


    }
}
