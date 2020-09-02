/**
 * @author lxyqaq
 * @date 2020/9/2 - 15:40
 */
public class VariableTest1 {
    public static void main(String[] args) {
/*
变量的使用
1. java定义变量的格式：数据类型 变量名 = 变量值;

2. 说明：
   ① 变量必须先声明，后使用
   ② 变量都定义在其作用域内。在作用域内，它是有效的。换句话说，出了作用域，就失效了
   ③ 同一个作用域内，不可以声明两个同名的变量
*/
        //变量的定义
        int myAge = 22;
        //变量的使用
        System.out.println(myAge);
        //变量的声明
        int myNumber;
        //变量的赋值
        myNumber = 2017;
    }
}
