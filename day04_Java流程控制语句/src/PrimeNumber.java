/**
 * @author lxyqaq
 * @date 2020/9/5 - 12:05
 */
public class PrimeNumber {
    public static void main(String[] args) {
        //输出100以内的质数

        //输出100以内的自然数
        for (int i = 2; i <= 100; i++) {
            boolean isFlag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
        }


    }
}
