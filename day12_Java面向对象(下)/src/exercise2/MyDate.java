package exercise2;

/**
 * @ClassName MyDate
 * @Description 日期类
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 11:23
 * @Version 1.0
 */

/*
 * MyDate类包含:
 * private成员变量year,month,day ;
 * toDateString()方法返回日期对应的字符串:xxxx年xx月xx日
 * */
public class MyDate {
    //年份
    private int year;
    //月份
    private int month;
    //日期
    private int day;

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
