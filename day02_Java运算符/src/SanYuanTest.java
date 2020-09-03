/**
 * @author lxyqaq
 * @date 2020/9/3 - 21:59
 */
public class SanYuanTest {
    public static void main(String[] args) {
/*
运算符之六：三元运算符
1.结构：(条件表达式)? 表达式1 : 表达式2
2. 说明
① 条件表达式的结果为boolean类型
② 根据条件表达式真或假，决定执行表达式1，还是表达式2.
  如果表达式为true，则执行表达式1。
  如果表达式为false，则执行表达式2。
③ 表达式1 和表达式2要求是一致的。
④ 三元运算符可以嵌套使用

3.
凡是可以使用三元运算符的地方，都可以改写为if-else
反之，不成立。

4. 如果程序既可以使用三元运算符，又可以使用if-else结构，那么优先选择三元运算符。原因：简洁、执行效率高。
*/

        //获取两个整数的较大值
        int m = 12;
        int n = 5;
        int max = (m > n) ? m : n;
        //输出12
        System.out.println(max);
        //看类型
        String maxTest = (m > n) ? "m的值更大" : "n的值更大";
        System.out.println(maxTest);

        //************************************************

        //获取三个数的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;
        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println(max2);


        //改写成if-else语句
        if (n1 > n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }


    }
}
