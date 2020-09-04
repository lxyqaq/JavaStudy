/**
 * @author lxyqaq
 * @date 2020/9/4 - 21:33
 */
public class ForTest {
    public static void main(String[] args) {
/*
For循环结构的使用
一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、for循环的结构

for(①;②;④){
	③
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

*/


        //输出5个hello world
        for (int i = 0; i < 5; i++) {
            System.out.println("hello world");
        }


        //i:在for循环内有效。出了for循环就失效了。
        //System.out.println(i);

        //练习：
        int num = 1;
        for (System.out.print('a'); num <= 3; System.out.print('c'), num++) {
            System.out.print('b');
        }
        //输出结果：abcbcbc

        System.out.println();


        //例题：遍历100以内的偶数,输出所有偶数的和,输出偶数的个数
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
        }

        System.out.println("偶数的和为：" + sum + "偶数的个数为：" + count);


    }
}
