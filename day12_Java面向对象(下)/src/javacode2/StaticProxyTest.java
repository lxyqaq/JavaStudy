package javacode2;

/**
 * @ClassName StaticProxyTest
 * @Description 代理模式-接口的应用
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:19
 * @Version 1.0
 */
public class StaticProxyTest {
    public static void main(String[] args) {

        //造一个真实的明星
        RealStar realStar1 = new RealStar();

        //造个经纪人
        Proxy proxy1 = new Proxy(realStar1);

        proxy1.confer();
        proxy1.signContract();
        proxy1.bookTicket();
        proxy1.sing();
        proxy1.collectMoney();

    }
}

//定义一个明星的接口(做明星的规范)
interface Star {
    public abstract void confer();// 面谈

    public abstract void signContract();// 签合同

    public abstract void bookTicket();// 订票

    public abstract void sing();// 唱歌

    public abstract void collectMoney();// 收钱
}


//被代理类(一个真实的明星)
class RealStar implements Star {

    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {
        System.out.println("明星自己唱歌");
    }

    @Override
    public void collectMoney() {

    }
}

//代理类(明星的经纪人)
class Proxy implements Star {

    private Star rela;

    public Proxy(Star rela) {
        this.rela = rela;
    }

    @Override
    public void confer() {
        System.out.println("经纪人去面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人去签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人去订票");
    }

    @Override
    public void sing() {
        rela.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人去收钱");
    }
}
