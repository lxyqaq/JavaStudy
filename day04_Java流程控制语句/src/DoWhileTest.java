/**
 * @author lxyqaq
 * @date 2020/9/5 - 09:58
 */
public class DoWhileTest {
    public static void main(String[] args) {
/*
do-while循环的使用

一、循环结构的4个要素
① 初始化条件
② 循环条件  --->是boolean类型
③ 循环体
④ 迭代条件

二、do-while循环结构：

①
do{
	③;
	④;

}while(②);

执行过程：① - ③ - ④ - ② - ③ - ④ - ... - ②

说明：
1.do-while循环至少会执行一次循环体！
2.开发中，使用for和while更多一些。较少使用do-while

*/

        //①
        int i = 1;
        int sum = 0;
        int count = 0;
        do {
            //③
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
                count++;
            }
            //④
            i++;
            //②
        } while (i < 100);

        System.out.println(sum);
        System.out.println(count);


    }
}
