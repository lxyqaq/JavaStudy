import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/5 - 10:31
 */
public class WhileTrueTest {
    public static void main(String[] args) {
/*
题目：
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。

说明：
1. 不在循环条件部分限制次数的结构：for(;;) 或 while(true)
2. 结束循环有几种方式？
     方式一：循环条件部分返回false
	 方式二：在循环体中，执行break
*/


        Scanner scan = new Scanner(System.in);
        //记录正数的个数
        int positiveNumber = 0;
        //记录负数的个数
        int negativeNumber = 0;
        //for (;;)    也可以使用这个结构代替为while(true)
        while (true) {
            int num = scan.nextInt();
            if (num > 0) {
                positiveNumber++;
            } else if (num < 0) {
                negativeNumber++;
            } else {
                //一旦执行break，跳出循环
                break;
            }
        }

        System.out.println("输入的正数的个数为：" + positiveNumber);
        System.out.println("输入的负数的个数为：" + negativeNumber);


    }
}
