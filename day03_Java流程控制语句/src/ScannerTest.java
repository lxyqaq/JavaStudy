import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/4 - 09:41
 */
public class ScannerTest {
    public static void main(String[] args) {
/*
如何从键盘获取不同类型的变量：需要使用Scanner类

具体实现步骤：
1.导包：import java.util.Scanner;
2.Scanner的实例化:Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法（next() / nextXxx()），来获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的值。如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException
导致程序终止。
*/

        //Scanner实例化
        Scanner scan1 = new Scanner(System.in);
        //调用方法

        System.out.println("请输入您的名字：");
        String name = scan1.next();

        System.out.println("请输入您的年龄：");
        int age = scan1.nextInt();

        System.out.println("请输入您的体重：");
        double weight = scan1.nextDouble();

        //true代表男性；false代表女性
        System.out.println("请输入您的性别：");
        boolean sex = scan1.nextBoolean();

        System.out.println("您的名字是：" + name + ",年龄是：" + age + ",体重是：" + weight + ",性别是：" + sex);


    }
}
