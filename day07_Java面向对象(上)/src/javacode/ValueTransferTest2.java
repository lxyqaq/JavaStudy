package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/9 - 23:27
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);
        //交换两个变量的值的操作
//		int temp = m ;
//		m = n;
//		n = temp;

        ValueTransferTest2 test = new ValueTransferTest2();
        test.swap(m, n);

        System.out.println("m = " + m + ", n = " + n);


    }


    public void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }
}
