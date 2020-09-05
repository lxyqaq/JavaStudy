/**
 * @author lxyqaq
 * @date 2020/9/5 - 14:27
 */
public class PrimeNumberOp {
    /*
            100000以内的所有质数的输出。实现方式二
    质数：素数，只能被1和它本身整除的自然数。-->从2开始，到这个数-1结束为止，都不能被这个数本身整除。

    对PrimeNumber.java文件中质数输出问题的优化
    */

    public static void main(String[] args) {

        //定义质数的个数
        int count = 0;
        //距离1970：00：00的毫秒数
        long start = System.currentTimeMillis();

        for (int i = 2; i <= 100000; i++) {
            boolean isFlag = true;
            //for (int j = 2; j < i; j++) {
            //优化3
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    //优化2
                    break;
                }
            }
            if (isFlag == true) {
                count++;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("质数的个数为：" + count);
        System.out.println("所花的时间为：" + (end - start));
        //1.  9592   8590s
        //2.  9592   842s
        //3.  9592   9s

    }
}
