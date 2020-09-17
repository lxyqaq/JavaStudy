package javacode4;

import org.junit.Test;

/**
 * @ClassName WrapperTest
 * @Description 包装类的一个测试
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/17 11:45
 * @Version 1.0
 */
public class WrapperTest {
    //基本数据类型 --->包装类：调用包装类的构造器
    @Test
    public void test1() {
        int num1 = 10;
        Integer integer1 = new Integer(num1);
        System.out.println(integer1.toString());
        Integer integer2 = new Integer("10");
        //true
        System.out.println(integer1.equals(integer2));
        //打印的是：1234
        System.out.println(integer2.toString());
        //报异常
        //Integer in3 = new Integer("123abc");
        //System.out.println(in3.toString());

        Float float1 = new Float(12.1F);
        Float float2 = new Float("12.1");
        System.out.println(float1);
        System.out.println(float2);
        //true
        System.out.println(float1.equals(float2));

        Boolean boolean1 = new Boolean(true);
        Boolean boolean2 = new Boolean("true");
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(boolean1.equals(boolean2));
        Boolean boolean3 = new Boolean("true123");
        //false
        System.out.println(boolean3);

        OrderOp order = new OrderOp();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null

    }

    //包装类转换成基本数据类型
    @Test
    public void test2() {
        Integer integer1 = new Integer(12);
        int i1 = integer1.intValue();
        System.out.println(integer1 + 1);
        System.out.println(i1 + 1);

        Float float1 = new Float(12.1F);
        float f1 = float1.floatValue();
        System.out.println(f1 + 1);
    }

    //JDK 5.0 新特性：自动装箱 与自动拆箱
    @Test
    public void test3() {
        //		int num1 = 10;
//		//基本数据类型-->包装类的对象
//		method(num1);

        //自动装箱：基本数据类型 --->包装类
        int num2 = 10;
        Integer in1 = num2;//自动装箱

        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱：包装类--->基本数据类型
        System.out.println(in1.toString());

        int num3 = in1;//自动拆箱
    }

    //基本数据类型、包装类--->String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test4() {
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);

        double d1 = 11.1;
        String str2 = String.valueOf(d1);
        System.out.println(str2);
    }

    //String类型转换成基本数据类型和包装类
    @Test
    public void test5() {
        String str1 = "123";
        int i1 = Integer.parseInt(str1);
        System.out.println(i1);
        Integer integer1 = Integer.parseInt(str1);
        System.out.println(integer1);

        String str2 = "false1";
        String str3 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        boolean b2 = Boolean.parseBoolean(str3);
        System.out.println(b1);
        System.out.println(b2);
    }
}

class OrderOp {
    boolean isMale;
    Boolean isFemale;
}