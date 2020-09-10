package exercise;

/**
 * @author lxyqaq
 * @date 2020/9/10 - 00:19
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //需要在method方法调用后，仅仅打印出a=100，b=200,写出method方法
        method(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void method(int a, int b) {
        a = 10 * 10;
        b = 10 * 20;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.exit(0);
    }
}
