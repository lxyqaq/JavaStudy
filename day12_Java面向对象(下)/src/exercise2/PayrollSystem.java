package exercise2;

import java.util.Scanner;

/**
 * @ClassName PayrollSystem
 * @Description 测试类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 11:49
 * @Version 1.0
 */

/*
 * 定义PayrollSystem类，创建Employee变量数组并初始化，
 * 该数组存放各类雇员对象的引用。利用循环结构遍历数组元素，
 * 输出各个对象的类型,name,number,birthday,以及该对象生日。
 * 当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * */
public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入当前月份：");
        int month = scanner.nextInt();

        Employee[] employee = new Employee[2];

        MyDate myDate1 = new MyDate(1997, 4, 12);
        employee[0] = new SalariedEmployee("nathan", 1000, myDate1, 5000);

        MyDate myDate2 = new MyDate(1996, 7, 25);
        employee[1] = new HourlyEmployee("jack", 1001, myDate2, 100, 60);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            double salary = employee[i].earnings();
            System.out.println("月工资为：" + salary);

            if (month == employee[i].getBirthday().getMonth()) {
                System.out.println("生日快乐，工资加1000,工资为：" + (salary + 1000));
            }
        }

    }
}
