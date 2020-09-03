/**
 * @author lxyqaq
 * @date 2020/9/3 - 14:32
 */
public class CompareTest {
    public static void main(String[] args) {
/*
运算符之三：比较运算符
==  !=  >  <  >= <=  instanceof

结论：
1.比较运算符的结果是boolean类型
2.区分 ==  和  =
*/

        int i = 10;
        int j = 20;

        //false
        System.out.println(i == j);
        //20,相当于赋值运算
        System.out.println(i = j);


        boolean b1 = true;
        boolean b2 = false;
        //false
        System.out.println(b2 == b1);
        //true，相当于赋值运算
        System.out.println(b2 = b1);


    }
}
