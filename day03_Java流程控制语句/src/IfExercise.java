import java.util.Scanner;

/**
 * @author lxyqaq
 * @date 2020/9/4 - 13:15
 */
public class IfExercise {
    public static void main(String[] args) {
        int x = 4;
        int y = 1;
        if (x > 2)
            if (y > 2)
                System.out.println(x + y);
                //System.out.println("atguigu");
            else //就近原则
                System.out.println("x is " + x);


        //课后练习3：测算狗的年龄

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入狗的年龄：");
        int age = scan.nextInt();
        if (age >= 0 && age <= 2) {
            System.out.println("狗的年龄为：" + age * 2);
        } else if (age < 0) {
            System.out.println("您输入的年龄有误");
        } else {
            System.out.println("狗的年龄为：" + (21 + 4 * (age - 2)));
        }


    }
}
