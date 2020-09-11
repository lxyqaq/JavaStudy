package exercise4;

/**
 * @author lxyqaq
 * @date 2020/9/11 - 22:42
 */
public class Bank {
    //存放多个客户的数组
    private Customer[] customers;
    //记录客户的个数
    private int numberOfCustomer;

    public Bank() {
        //造一个银行就new一个数组
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String firstName, String lastName) {
        //每添加的一个客户就new一个对象
        Customer customer = new Customer(firstName, lastName);
        //存进customers数组,调用方法就++
        customers[numberOfCustomer++] = customer;
    }

    //获取客户的个数
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomer) {
            return customers[index];
        }
        return null;
    }
}
