package exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/8 - 18:09
 */

/*
 * 4. 对象数组题目：
定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。
 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一：打印出3年级(state值为3）的学生信息(年级为1-6)。
问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息

提示：
1) 生成随机数：Math.random()，返回值类型double;
2) 四舍五入取整：Math.round(double d)，返回值类型long。
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] student = new Student[20];

        for (int i = 0; i < student.length; i++) {
            //给数组元素赋值
            student[i] = new Student();
            student[i].number = (i + 1);
            student[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            student[i].score = (int) (Math.random() * (100 - 0) + 1);
        }

        //遍历学生数组
        System.out.println("全部学生信息为：");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].info());
        }

        //打印某某年级的学生信息
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入要打印学生的年级：");
        int state1 = scan.nextInt();
        //遍历
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == state1) {
                System.out.println(student[i].info());
            }
        }

        //排序
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - 1 - i; j++) {
                if (student[j].score > student[j + 1].score) {
                    //如果需要换序，交换的是数组的元素：Student对象！！！
                    Student temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }

        System.out.println("排序后学生数组为：");
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].info());
        }


    }
}

class Student {
    //学号
    public int number;
    //年级
    public int state;
    //成绩
    public int score;

    //方法
    public String info() {
        return "学号为：" + number + "\t年级为：" + state + "\t成绩为：" + score;
    }
}
