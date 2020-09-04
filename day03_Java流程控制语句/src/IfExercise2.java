/**
 * @author lxyqaq
 * @date 2020/9/4 - 13:48
 */
public class IfExercise2 {
    public static void main(String[] args) {

        //如何获取一个随机数：10 - 99

        int value = (int) (Math.random() * 90 + 10);
        //公式: [a,b]  :  (int)(Math.random() * (b - a + 1) )+ a
        System.out.println(value);

    }
}
