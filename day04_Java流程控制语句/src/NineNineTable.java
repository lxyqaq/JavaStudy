/**
 * @author lxyqaq
 * @date 2020/9/5 - 11:53
 */
public class NineNineTable {
    public static void main(String[] args) {
        /*
         * 嵌套循环练习
         * 九九乘法表
         * 1 * 1 = 1
         * 2 * 1 = 2  2 * 2 = 4
         * .......
         * 9 * 1 = 9 ......9 * 9 = 81
         *
         * */

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " * " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }


    }
}
