package javacode1;

/**
 * @ClassName TemplateTest
 * @Description 模板方法的设计模式
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/18 23:17
 * @Version 1.0
 */
public class TemplateTest {
    /*
     * 抽象类的应用：模板方法的设计模式
     *
     */
    public static void main(String[] args) {

        //多态
        Template t = new SubTemplate();
        t.spendTime();

    }
}

abstract class Template {

    /**
     * @description 计算 某段代码 执行所需要花费的时间
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/18 23:19
     */
    public void spendTime() {

        long start = System.currentTimeMillis();

        this.code();//不确定的部分、易变的部分

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));

    }

    public abstract void code();


}

class SubTemplate extends Template {

    @Override
    public void code() {

        for (int i = 2; i <= 1000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if (isFlag) {
                System.out.println(i);
            }
        }

    }

}
