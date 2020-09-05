/**
 * @author lxyqaq
 * @date 2020/9/5 - 09:48
 */
public class WhileTest {
    public static void main(String[] args) {
/*
While 循环的使用

一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、while循环的结构

①
while(②){
	③;
	④;
}

执行过程：① - ② - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.写while循环千万小心不要丢了迭代条件。一旦丢了，就可能导致死循环！
2.我们写程序，要避免出现死循环。
3.for循环和while循环是可以相互转换的！
  区别：for循环和while循环的初始化条件部分的作用范围不同。


算法：有限性。

*/

        //①
        int i = 1;
        int sum = 0;
        int count = 0;
        //②
        while (i < 100) {
            //③
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            //④
            i++;
        }

        System.out.println(sum);
        System.out.println(count);

    }
}
