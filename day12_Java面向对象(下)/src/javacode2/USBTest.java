package javacode2;


/**
 * @ClassName USBTest
 * @Description USB接口转换成代码思想
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 17:40
 * @Version 1.0
 */
public class USBTest {

    public static void main(String[] args) {

        //造两个电脑的对象
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        //造一个U盘的对象
        Flash flash1 = new Flash();

        //造一个打印机的对象
        Printer printer1 = new Printer();

        //使用U盘,多态性的体现
        computer1.transferData(flash1);

        //使用打印机
        computer2.transferData(printer1);
    }

}

class Computer {
    //使用USB接口传输数据
    public void transferData(USB usb) {
        usb.start();

        System.out.println("工作时的细节");

        usb.end();
    }
}

interface USB {
    //USB接口定义了许多规范

    //开始工作
    public abstract void start();

    //结束工作
    public abstract void end();

}

class Flash implements USB {

    //U盘

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void end() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB {

    //打印机

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作");
    }
}