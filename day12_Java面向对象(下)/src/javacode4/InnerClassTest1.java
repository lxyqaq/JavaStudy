package javacode4;

/**
 * @ClassName InnerClassTest1
 * @Description 开发中内部类的使用
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/20 19:46
 * @Version 1.0
 */
public class InnerClassTest1 {
    //开发中很少见
    public void method() {
        //局部内部类
        class AA {

        }
    }


    //返回一个实现了Comparable接口的类的对象
    public Comparable getComparable() {

        //创建一个实现了Comparable接口的类:局部内部类
        //方式一：
//		class MyComparable implements Comparable{
//
//			@Override
//			public int compareTo(Object o) {
//				return 0;
//			}
//
//		}
//
//		return new MyComparable();

        //方式二：
        return new Comparable() {

            @Override
            public int compareTo(Object o) {
                return 0;
            }

        };

    }
}
