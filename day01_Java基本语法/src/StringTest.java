/**
 * @author lxyqaq
 * @date 2020/9/2 - 22:08
 */
public class StringTest {
    public static void main(String[] args) {
/*
String类型变量的使用
1. String属于引用数据类型,翻译为：字符串
2. 声明String类型变量时，使用一对""
3. String可以和8种基本数据类型变量做运算，且运算只能是连接运算：+
4. 运算的结果仍然是String类型
*/
        String str1 = "Hello World";
        System.out.println(str1);

        String str2 = "a";
        String str3 = "";

        //char c = '';编译不通过

        //******************************
        int num1 = 2017;
        String strNum = "学号：";
        //+:连接运算
        String info = strNum + num1;
        System.out.println(info);
        boolean b1 = true;
        String info1 = strNum + b1;
        System.out.println(info1);

        //******************************
        //练习1

        //a=97;A=65
        char c = 'a';
        int num = 10;
        String str = "hello";
        //107hello
        System.out.println(c + num + str);
        //ahello10
        System.out.println(c + str + num);
        //a10hello
        System.out.println(c + (num + str));
        //107hello
        System.out.println((c + num) + str);
        //hello10a
        System.out.println(str + num + c);

        //练习2

        //*	*
        System.out.println("*	*");
        //93
        System.out.println('*' + '\t' + '*');
        //* *
        System.out.println('*' + "\t" + '*');
        //51*
        System.out.println('*' + '\t' + "*");
        //* *
        System.out.println('*' + ('\t' + "*"));

        //String str1 = 123;//编译不通过
        String str4 = 123 + "";
        //"123"
        System.out.println(str4);

        //int num1 = str1;
        //int num1 = (int)str1;//"123"

        int num2 = Integer.parseInt(str1);
        //123
        System.out.println(num2);

    }
}
