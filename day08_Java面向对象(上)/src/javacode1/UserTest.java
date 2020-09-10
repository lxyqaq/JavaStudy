package javacode1;

/**
 * @author lxyqaq
 * @date 2020/9/10 - 23:02
 */
public class UserTest {
    /*
     * 总结：属性赋值的先后顺序
     *
     *
     * ① 默认初始化
     * ② 显式初始化
     * ③ 构造器中初始化
     *
     * ④ 通过"对象.方法" 或 "对象.属性"的方式，赋值
     *
     * 以上操作的先后顺序：① - ② - ③ - ④
     *
     */
    public static void main(String[] args) {
        User u = new User();
        u.age = 3;

        //3
        System.out.println(u.age);
    }
}
class User {
    String name;
    //int age;
    int age = 1;

    public User(){
        age = 2;
    }

}