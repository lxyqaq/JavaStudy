package exercise3;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 21:05
 */
public class Customer {
    //名
    private String firstName;
    //姓
    private String lastName;
    //账号
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setAccount(Account account) {
        this.account = account;
    }

}
