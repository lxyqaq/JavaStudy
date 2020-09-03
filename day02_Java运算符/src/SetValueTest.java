/**
 * @author lxyqaq
 * @date 2020/9/3 - 14:10
 */
public class SetValueTest {
    public static void main(String[] args) {
        /*
         * 运算符之二：赋值运算符
         *
         * =  +=  -=  *=  /=  %=
         *
         * */

        int i1 = 10;
        int j1 = 10;

        int i2, j2;
        //连续赋值
        i2 = j2 = 10;

        int i3 = 10, j3 = 20;

        //************************

        int num1 = 10;
        //num1 = num1 + 2;
        num1 += 2;
        //输出12
        System.out.println(num1);

        int num2 = 12;
        //num2 = num2 % 2;
        num2 %= 2;
        //输出2
        System.out.println(num2);

        short s1 = 10;
        //s1 = s1 + 2;会编译失败
        //结论：不会改变变量本身的数据类型
        s1 += 2;
        System.out.println(s1);

        //开发中，如果希望变量实现+2的操作，有几种方法？(前提：int num = 10;)
        //方式一：num = num + 2;
        //方式二：num += 2; (推荐)

        //开发中，如果希望变量实现+1的操作，有几种方法？(前提：int num = 10;)
        //方式一：num = num + 1;
        //方式二：num += 1;
        //方式三：num++; (推荐)

        //练习1
        int i = 1;
        i *= 0.1;
        //输出0
        System.out.println(i);
        i++;
        //输出1
        System.out.println(i);

        //练习2
        int m = 2;
        int n = 3;
        //n = n * m++
        n *= m++;
        //输出m=3
        System.out.println("m=" + m);
        //输出n=6
        System.out.println("n=" + n);

        //练习3
        int n1 = 10;
        //n1 = n1 + (n1++) + (++n1);
        n1 += (n1++) + (++n1);
        //输出32
        System.out.println(n1);


    }
}
