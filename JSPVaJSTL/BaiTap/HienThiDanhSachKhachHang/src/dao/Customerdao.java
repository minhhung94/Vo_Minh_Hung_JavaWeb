package dao;

import model.Customer;

import java.util.*;

public class Customerdao {
    private static final Map<Integer, Customer>  listCustomer = new HashMap<Integer, Customer>();

    static {
        initCustomers();
    }

    private static void initCustomers(){
        Customer cus1 = new Customer(1,"Le Dinh Quoc","098752221","dinhquoc@gmail.com");
        Customer cus2 = new Customer(2,"Nguyen Duc Thong","088752221","thongnguyen@gmail.com");
        Customer cus3 = new Customer(3,"Le Hoang Long","0977521231","longle@gmail.com");
        Customer cus4 = new Customer(4,"Pham Thai Cuong","078752244","thaicuong@gmail.com");

        listCustomer.put(cus1.getId(),cus1);
        listCustomer.put(cus2.getId(),cus2);
        listCustomer.put(cus3.getId(),cus3);
        listCustomer.put(cus4.getId(),cus4);
    }
// get thông tin chi tiết của 1 custoemr theo id
    public static Customer getCustomer(int customerId){
        return listCustomer.get(customerId);
    }

    public  static void addCustomer(Customer customer){
        listCustomer.put(customer.getId(),customer);
    }

    //update thông tin 1 customer
    public static Customer updateCustomer(Customer customer){
        listCustomer.put(customer.getId(),customer);
        return customer;
    }

    public static void  deleteCustomer(int customerId){
        listCustomer.remove(customerId);
    }

    public static List<Customer> getAllCustomer(){
        Collection<Customer> cus = listCustomer.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(cus);
        return list;
    }
}
