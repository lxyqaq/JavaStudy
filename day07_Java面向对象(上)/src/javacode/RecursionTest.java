package javacode;

import java.util.IdentityHashMap;
import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/10 - 12:07
 */

/*
 * 递归方法的使用（了解）
 * 1.递归方法：一个方法体内调用它自身。
 * 2. 方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无须循环控制。
 * 递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环。
 */
public class RecursionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入n：");
        int number = scanner.nextInt();

        RecursionTest test = new RecursionTest();
        int sum = test.getSum(number);
        System.out.println("1-n的和为：" + sum);

        int factorial = test.getFactorial(number);
        System.out.println("n的阶乘为：" + factorial);

        int fn = test.f(number);
        System.out.println("f(n) = " + fn);

        int sn = test.sn(number);
        System.out.println(sn);
    }

    //例1：计算1-n之间所有自然数的和
    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }

    //计算1-n之间所有自然数的乘积:n!
    public int getFactorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * getFactorial(n - 1);
        }
    }

    //例3：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),
    //其中n是大于0的整数，求f(10)的值。
    public int f(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * f(n - 1) + f(n - 2);
        }
    }

    //例4：斐波那契数列
    //0 1 1 2 3 5 8 ...
    public int sn(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 1;
        } else if (n == 4) {
            return 2;
        } else {
            return sn(n - 1) + sn(n - 2);
        }
    }

    //例5：汉诺塔问题

    //例6：快排

}
