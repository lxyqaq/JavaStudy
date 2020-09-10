package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/10 - 01:03
 */
public class ValueTransferTest3 {

    public static void main(String[] args) {

        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n);

        //交换m和n的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;

        ValueTransferTest3 test = new ValueTransferTest3();
        test.swap(data);


        System.out.println("m = " + data.m + ", n = " + data.n);

    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data {
    int m;
    int n;
}