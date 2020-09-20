package exercise4;

/**
 * @InterfaceName CompareObject
 * @Description 比较两个圆半径的大小
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/20 18:08
 * @Version 1.0
 */
public interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public abstract int compareTo(Object o);
}
