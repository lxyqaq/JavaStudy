package exercise4;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 22:40
 */
public class Customer {
    //名
    private String firstName;
    //姓
    private String lastName;
    //账户
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
}
