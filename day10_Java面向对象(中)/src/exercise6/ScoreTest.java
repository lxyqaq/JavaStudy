package exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * @ClassName ScoreTest
 * @Description 题目
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 13:09
 * @Version 1.0
 */
public class ScoreTest {
/*
 *  利用Vector代替数组处理：从键盘读入学生成绩（以负数代表输入结束），找出最高分，并输出学生成绩等级。
	提示：数组一旦创建，长度就固定不变，所以在创建数组前就需要知道它的长度。
	而向量类java.util.Vector可以根据需要动态伸缩。

	创建Vector对象：Vector v=new Vector();
	给向量添加元素：v.addElement(Object obj);   //obj必须是对象
	取出向量中的元素：Object  obj=v.elementAt(0);
	注意第一个元素的下标是0，返回值是Object类型的。
	计算向量的长度：v.size();
	若与最高分相差10分内：A等；20分内：B等；
	      30分内：C等；其它：D等
*/

    public static void main(String[] args) {
        //从键盘接收成绩
        Scanner scan = new Scanner(System.in);
        Vector v = new Vector();

        //定义一个最大数
        int maxScore = 0;
        for (; ; ) {
            System.out.println("请输入学生的成绩(输入负数结束)：");
            int score = scan.nextInt();
            //输入的数为负数时跳出循环
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("请重新输入!");
                continue;
            }
            //3.1 添加操作：：v.addElement(Object obj)
            //jdk5.0之前：
            //Integer inScore = new Integer(score);
            //v.addElement(inScore);//多态
            //jdk5.0之后：

            //自动装箱:直接将基本数据类型转换成包装类
            v.addElement(score);

            if (maxScore < score) {
                maxScore = score;
            }
        }

        System.out.println("最高分为："+maxScore);
        //遍历Vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级。
        char level;
        for (int i = 0; i < v.size(); i++) {

            Object obj = v.elementAt(i);
            //jdk 5.0之前：
            //Integer inScore = (Integer)obj;
            //int score = inScore.intValue();
            //jdk 5.0之后：

            //自动拆箱:将包装类转换成基本数据类型才能比较成绩
            int score = (int) obj;
            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            } else if (maxScore - score <= 30) {
                level = 'C';
            } else {
                level = 'D';
            }
            System.out.println("student-" + i + " score is " + score + ",level is " + level);
        }

    }
}
