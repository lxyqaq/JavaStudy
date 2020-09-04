import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/4 - 10:25
 */
public class IfTest2 {
    public static void main(String[] args) {
/*
编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
对它们进行排序(使用 if-else if-else),并且从大到小输出。

说明：
1. if-else结构是可以相互嵌套的。
2. 如果if-else结构中的执行语句只有一行时，对应的一对{}可以省略的。但是，不建议大家省略。
*/

        //实例化Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int num1 = scan.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = scan.nextInt();

        System.out.println("请输入第三个数字：");
        int num3 = scan.nextInt();

        if (num1 > num2) {
            if (num3 > num1) {
                System.out.println(num3 + "\t" + num1 + "\t" + num2);
            } else if (num3 < num2) {
                System.out.println(num1 + "\t" + num2 + "\t" + num3);
            } else {
                System.out.println(num1 + "\t" + num3 + "\t" + num2);
            }
        } else {
            if (num3 > num2) {
                System.out.println(num3 + "\t" + num2 + "\t" + num1);
            } else if (num3 < num1) {
                System.out.println(num2 + "\t" + num1 + "\t" + num3);
            } else {
                System.out.println(num2 + "\t" + num3 + "\t" + num1);
            }
        }

    }
}
