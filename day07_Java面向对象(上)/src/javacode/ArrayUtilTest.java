package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/9 - 22:26
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 34, 32, 5, 3, 54, 654, -98, 0, -53, 5};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);

        System.out.println("排序前：");
        util.print(arr);


        util.sort(arr);
        System.out.println("排序后：");
        util.print(arr);
    }
}
