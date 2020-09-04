/**
 * @author lxyqaq
 * @date 2020/9/4 - 21:56
 */
public class ForExercise1 {
    public static void main(String[] args) {
/*
编写程序从1循环到150，并在每行打印一个值，
另外在每个3的倍数行上打印出“foo”,
在每个5的倍数行上打印“biz”,
在每个7的倍数行上打印输出“baz”。

*/

        for (int i = 1; i < 150; i++) {
            System.out.print(i + "  ");
            if (i % 3 == 0) {
                System.out.println("foo");
            }
            if (i % 5 == 0) {
                System.out.println("biz");
            }
            if (i % 7 == 0) {
                System.out.println("baz");
            }
            //换行
            System.out.println();
        }
    }
}
