package exercise;

/**
 * @ClassName KidsTest
 * @Description 测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/14 11:58
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids somekids = new Kids(12);

        somekids.printAge();

        somekids.setSalary(0);
        somekids.setSex(1);

        somekids.employeed();
        somekids.manOrWoman();
    }
}
