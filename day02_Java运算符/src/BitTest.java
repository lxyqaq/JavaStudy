/**
 * @author lxyqaq
 * @date 2020/9/3 - 21:14
 */
public class BitTest {
    public static void main(String[] args) {
/*
运算符之五：位运算符 （了解）

结论：
1. 位运算符操作的都是整型的数据
2. << ：在一定范围内，每向左移1位，相当于 * 2
   >> :在一定范围内，每向右移1位，相当于 / 2



面试题：最高效方式的计算2 * 8 ？  2 << 3  或 8 << 1
*/

        int i = 5;
        //5*(2^2) 输出20
        System.out.println("i << 2 = " + (i << 2));
        //5*(2^3) 输出40
        System.out.println("i << 3 = " + (i << 3));
        //5*(2^5) 输出160
        System.out.println("i << 5 = " + (i << 5));

        int m = 12;
        int n = 5;
        //从二进制上面去理解，0看成false，1看成true
        System.out.println("m & n = " + (m & n));
        System.out.println("m | n = " + (m | n));
        System.out.println("m ^ n = " + (m ^ n));

        //练习：交换两个变量的值

        //方式一：定义临时变量的方式
        //推荐的方式
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1 + ",num2 = " + num2);

        //方式二：好处：不用定义临时变量
        //弊端：① 相加操作可能超出存储范围 ② 有局限性：只能适用于数值类型
        //num1 = num1 + num2;
        //num2 = num1 - num2;
        //num1 = num1 - num2;

        //方式三：使用位运算符
        //有局限性：只能适用于数值类型
        int num3 = 10;
        int num4 = 20;
        num3 = num3 ^ num4;
        System.out.println(num3);
        num4 = num3 ^ num4;
        System.out.println(num4);
        num3 = num3 ^ num4;


        System.out.println("num3 = " + num3 + ",num4 = " + num4);


    }
}
