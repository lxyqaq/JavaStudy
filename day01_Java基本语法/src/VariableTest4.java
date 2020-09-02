/**
 * @author lxyqaq
 * @date 2020/9/2 - 21:35
 */
public class VariableTest4 {
    public static void main(String[] args) {
/*
强制类型转换：自动类型提升运算的逆运算。
1.需要使用强转符：()
2.注意点：强制类型转换，可能导致精度损失。
*/
        double d1=12.9;
        //精度损失举例1
        //截断操作
        int i1=(int)d1;
        System.out.println(i1);

        //没有精度损失
        long l1=123;
        short s1=(short)l1;
        System.out.println(s1);

        //精度损失举例2
        int i2=128;
        //输出-128
        byte b1=(byte)i2;
        System.out.println(b1);

    }
}
