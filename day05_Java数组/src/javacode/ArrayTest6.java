package javacode;

/**
 * @author lxyqaq
 * @date 2020/9/7 - 18:55
 */
public class ArrayTest6 {
    public static void main(String[] args) {
        //查找

        //线性查找
        String[] array1 = new String[]{"aa", "bb", "cc", "dd", "ee", "ff"};
        //要查找的数
        String dest1 = "ee";
        //dest1 = "qq";就无法找到

        //定义一个标识
        boolean isFlag1 = true;
        //遍历查找
        System.out.print("数组为：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
            if (dest1.equals(array1[i])) {
                System.out.println();
                System.out.println("找到了这个数，位置是：" + i);
                isFlag1 = false;
                break;
            }
        }
        if (isFlag1) {
            System.out.println("很遗憾没有找到这个数！");
        }

        System.out.println();

        //二分法查找
        int[] array2 = new int[]{-128, -15, -3, -2, 35, 13, 56, 41, 88, 288};

        int dest2 = -15;
        //dest2 =8;
        boolean isFlag2 = true;
        //初始的首索引
        int head = 0;
        //初始的后索引
        int end = array2.length - 1;
        while (head <= end) {
            int middle = (head + end) / 2;
            if (dest2 == array2[middle]) {
                System.out.println("恭喜你找到了这个数，位置为：" + middle);
                isFlag2 = false;
                break;
            } else if (dest2 < array2[middle]) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (isFlag2) {
            System.out.println("很遗憾，没有找到这个数！");
        }


    }
}
