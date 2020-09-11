package exercise4;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 23:14
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank1 = new Bank();

        bank1.addCustomer("Nathan", "Drake");

        bank1.getCustomer(0).setAccount(new Account(2000));

        bank1.getCustomer(0).getAccount().withdraw(500);

        bank1.getCustomer(0).getAccount().deposit(1000);

        System.out.println(bank1.getCustomer(0).getAccount().getBalance());

        System.out.println(bank1.getCustomer(0).getFirstName() + " " + bank1.getCustomer(0).getLastName());

        System.out.println("***********************");
        bank1.addCustomer("万里", "杨");

        System.out.println("银行客户的个数为：" + bank1.getNumberOfCustomer());
    }
}
