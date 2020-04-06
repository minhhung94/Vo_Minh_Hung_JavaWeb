package Dao;

import Model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer,Customer> CUSTOMER_MAP = new HashMap<Integer,Customer>();

    static {
        intitCustomers();
    }

    private static void intitCustomers() {
        Customer cus1 = new Customer(1,"Tran Ngoc Tan","091312382","tantran@gmail.com","Da nang");
        Customer cus2 = new Customer(2,"Pham Minh Hung","092412382","hungpham@gmail.com","Quang Trị");
        Customer cus3 = new Customer(3,"Le Dinh Quoc","097782382","quocle@gmail.com","Nam Phuoc");
        Customer cus4 = new Customer(4,"Tong Quang Tien","098562382","tienquang@gmail.com","Hue");

        CUSTOMER_MAP.put(cus1.getId(),cus1);
        CUSTOMER_MAP.put(cus2.getId(),cus2);
        CUSTOMER_MAP.put(cus3.getId(),cus3);
        CUSTOMER_MAP.put(cus4.getId(),cus4);

    }

    // Viết phương thức get thông tin chi tiết của 1 cưstomer
    public static Customer getCustomer(int customerId){
        return CUSTOMER_MAP.get(customerId);
    }

    //Viết phương thức thêm mới 1 customer vào danh sách
    public static void addCustomer(Customer customer){
        CUSTOMER_MAP.put(customer.getId(),customer);
    }

    //Viết phương thức update thông tin 1 customer
    public static Customer updateAndCreateCustomer(Customer customer){
        CUSTOMER_MAP.put(customer.getId(),customer);
        return customer;
    }

    //Viết phương thức delete 1 customer theo id
    public static void deleteCustomer(int customerId){
        CUSTOMER_MAP.remove(customerId);
    }

    //Viết phương thức lấy tất cả customer
    public static List<Customer> getAllCustomer(){
        Collection<Customer> c = CUSTOMER_MAP.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(c);
        return list;
    }
}
