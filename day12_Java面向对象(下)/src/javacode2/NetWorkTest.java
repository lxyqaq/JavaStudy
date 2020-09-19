package javacode2;

/**
 * @ClassName NetWorkTest
 * @Description 代理模式
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/9/19 18:10
 * @Version 1.0
 */
public class NetWorkTest {
    public static void main(String[] args) {
        //造一个服务器
        Server server = new Server();
        //造一个代理运营商
        ProxyServer proxyServer = new ProxyServer(server);

        proxyServer.browse();
    }
}

interface NetWork {

    //定义一个网络的接口，提供浏览网络的抽象方法
    public void browse();

}

//被代理类
class Server implements NetWork {

    //服务器去实现网络的接口，重写浏览网络的抽象方法
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }

}

//代理类
class ProxyServer implements NetWork {

    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }


    public void check() {
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();

        work.browse();

    }

}