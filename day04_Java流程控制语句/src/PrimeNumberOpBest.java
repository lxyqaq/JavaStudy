/**
 * @author lxyqaq
 * @date 2020/9/5 - 14:57
 */
public class PrimeNumberOpBest {
    public static void main(String[] args) {
        //定义质数的个数
        int count = 0;
        //距离1970：00：00的毫秒数
        long start = System.currentTimeMillis();

        Label:
        for (int i = 2; i <= 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue Label;
                }
            }
            count++;
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花的时间为：" + (end - start));

    }
}
