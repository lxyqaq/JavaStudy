package javacode2;

/**
 * @ClassName OverrideTest
 * @Description 异常重写
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/21 21:10
 * @Version 1.0
 */

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重写的规则之一：
 * 子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *
 */
public class OverrideTest {

    public static void main(String[] args) {
        OverrideTest test = new OverrideTest();
        test.display(new SubClass());
    }


    public void display(SuperClass s) {
        try {
            s.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class SuperClass {

    public void method() throws IOException {

    }


}

class SubClass extends SuperClass {
    public void method() throws FileNotFoundException {

    }
}

