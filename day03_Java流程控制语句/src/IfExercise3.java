import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/4 - 14:10
 */
public class IfExercise3 {
    public static void main(String[] args) {
/*
大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条件：
高：180cm以上；富：财富1千万以上；帅：是。
如果这三个条件同时满足，则：“我一定要嫁给他!!!”
如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
如果三个条件都不满足，则：“不嫁！”

*/

        Scanner scan1 = new Scanner(System.in);
        System.out.println("请输入您的身高(cm)：");
        double height = scan1.nextDouble();
        System.out.println("请输入您的财富(千万)：");
        double money = scan1.nextDouble();
        System.out.println("请输入您是否帅：(是/否)");
        String isHandsome = scan1.next();


        if (height >= 180 && money >= 1 && isHandsome.equals("是")) {
            System.out.println("我一定要嫁给他");
        } else if (height >= 180 || money >= 1 || isHandsome.equals("是")) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁");
        }
    }
}
