package interview;

/**
 * @ClassName InterviewTest1
 * @Description 面试真题
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/16 18:51
 * @Version 1.0
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        //看父类的方法，子类重写的方法
        //自己不要多想，严格按照定义来分析题目
        Base1 base = new Sub1();
        base.add(1, 2, 3);

        Sub1 s = (Sub1) base;
        s.add(1, 2, 3);
    }
}

//父类
class Base1 {
    public void add(int a, int... arr) {
        System.out.println("base1");
    }
}
//子类
class Sub1 extends Base1 {

    public void add(int a, int[] arr) {
        System.out.println("sub_1");
    }

    public void add(int a, int b, int c) {
        System.out.println("sub_2");
    }

}