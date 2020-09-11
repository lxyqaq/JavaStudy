package exercise3;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 21:11
 */
public class CustomerTest {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jane", "Smith");
        Account account1 = new Account(1000, 2000, 0.0123);

        customer1.setAccount(account1);

        customer1.getAccount().deposit(100);
        customer1.getAccount().withdraw(960);
        customer1.getAccount().withdraw(2000);

        String info = "Customer " + "[" + customer1.getLastName() + "," + customer1.getFirstName() +
                "] has a account: id is " + customer1.getAccount().getId() +
                "，annuallnterestRate is " + customer1.getAccount().getAnnuallnterestRate() * 100 +
                "%，balance is " + customer1.getAccount().getBalance();

        System.out.println(info);
    }
}
