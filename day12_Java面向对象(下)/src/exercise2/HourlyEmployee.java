package exercise2;

/**
 * @ClassName HourlyEmployee
 * @Description 小时工资员工类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 11:44
 * @Version 1.0
 */

/*
 * 参照SalariedEmployee类定义HourlyEmployee类，
 * 实现按小时计算工资的 员工处理。该类包括:
 * private成员变量wage和hour;
 * 实现父类的抽象方法earnings(),该方法返回wage*hour值;
 * toString()方法输出员工类型信息及员工的name，number,birthday。
 * */
public class HourlyEmployee extends Employee {

    //工资
    private double wage;
    //小时
    private double hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() + "}";
    }

}
