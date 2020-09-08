package exercise;

import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/8 - 20:40
 */
public class StudentTestOp {
    public static void main(String[] args) {
        StudentOp[] student = new StudentOp[20];

        for (int i = 0; i < student.length; i++) {
            //给数组元素赋值
            student[i] = new StudentOp();
            student[i].number = (i + 1);
            student[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
            student[i].score = (int) (Math.random() * (100 - 0) + 1);
        }

        StudentTestOp testOp = new StudentTestOp();
        System.out.println("全部学生信息为：");
        testOp.print(student);

        Scanner scan1 = new Scanner(System.in);
        System.out.print("请输入要查找的年级：");
        int state1 = scan1.nextInt();
        testOp.searchState(student, state1);

        System.out.println("排序后的数组为：");
        testOp.sort(student);
        testOp.print(student);


    }

    /**
     * 封装的方法
     */

    //遍历
    public void print(StudentOp[] student) {
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].info());
        }
    }

    //打印某某年级的学生信息
    public void searchState(StudentOp[] student, int state1) {
        for (int i = 0; i < student.length; i++) {
            if (student[i].state == state1) {
                System.out.println(student[i].info());
            }
        }
    }

    //冒泡排序
    public void sort(StudentOp[] student) {
        for (int i = 0; i < student.length - 1; i++) {
            for (int j = 0; j < student.length - 1 - i; j++) {
                if (student[j].score > student[j + 1].score) {
                    //如果需要换序，交换的是数组的元素：Student对象！！！
                    StudentOp temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }
    }

}

class StudentOp {
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