package service;

import bean.Customer;

/**
 * @ClassName CustomerList
 * @Description CustomerList为Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用。
 * @Author lxyqaq @Email:A00279565@student.ait.ie
 * @Date 2020/9/13 12:40
 * @Version 1.0
 */
public class CustomerList {
    //用来保存客户对象的数组
    private Customer[] customers;
    //记录已保存客户对象的数量
    private int total = 0;

    /**
     * @param totalCustomer: 指定customers数组的最大空间
     * @description 用来初始化customer数组
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 13:24
     */
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @param customer: 指定要添加的客户对象
     * @return true:添加成功 false:添加失败
     * @description 将指定的客户添加到数组中
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 13:29
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * @param index
     * @param cust
     * @return true:修改成功 false:索引无效，无法替换
     * @description 用参数customer替换数组中由index指定的对象
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 14:03
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = customer;
        return true;
    }

    /**
     * @param index
     * @return true:删除成功 false:索引无效，无法删除
     * @description 从数组中删除参数index指定索引位置的客户对象记录
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 14:09
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = 0; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        //最后的元素需要置空
        customers[--total] = null;
        return true;
    }

    /**
     * @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同
     * @description 返回数组中记录的所有客户对象
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 14:19
     */
    public Customer[] getAllCustomers() {
        Customer[] cust = new Customer[total];
        for (int i = 0; i < total; i++) {
            cust[i] = customers[i];
        }
        return cust;
    }

    /**
     * @param index
     * @return 封装了客户信息的Customer对象, 没有找到返回null
     * @description 返回参数index指定索引位置的客户对象记录
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 14:25
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * @return total的值
     * @description 获取存储的客户的数量
     * @author lxyqaq @email A00279565@student.ait.ie
     * @date 2020/9/13 14:29
     */
    public int getTotal() {
        return total;
    }
}
