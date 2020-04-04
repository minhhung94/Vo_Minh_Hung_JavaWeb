package dao;

import model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<Integer, Customer>();

    static {
        intitCustomers();
    }

    private static void intitCustomers() {
        Customer cus1 = new Customer(1,"Nguyen Dinh Hoa","0987721232","hoanguyen@gmail.com");
        Customer cus2 = new Customer(2,"Tran Ngoc Tan","0975541232","tantran@gmail.com");
        Customer cus3 = new Customer(3,"Pham Thai Cuong","0864441232","cuongpham@gmail.com");
        Customer cus4 = new Customer(4,"Le Dinh Quoc","0899721232","quocle@gmail.com");
        Customer cus5 = new Customer(5,"Nguyen Duc Thong","0887721232","thongnguyen@gmail.com");

        listCUSTOMER.put(cus1.getId(),cus1);
        listCUSTOMER.put(cus2.getId(),cus2);
        listCUSTOMER.put(cus3.getId(),cus3);
        listCUSTOMER.put(cus4.getId(),cus4);
        listCUSTOMER.put(cus5.getId(),cus5);
    }
    //Phương thúc sử lý get thông tin chi tiết của 1 customer

    public static Customer getCustomer(int customerId){
        return listCUSTOMER.get(customerId);
    }

    // phương thức thêm mới 1 customer vào danh sách
    public static void addCustomer(Customer customer){
        listCUSTOMER.put(customer.getId(),customer);
    }

    //Phương thúc update thông tin 1 customer
    public static Customer updateAndCreateCustomer(Customer customer){
        listCUSTOMER.put(customer.getId(),customer);
        return customer;
    }

    //Phương thức delete 1 customer theo id
    public static void deleteCustomer(int customerId){
        listCUSTOMER.remove(customerId);
    }

    //Phương thức lấy all customer
    public static List<Customer> getAllCustomer(){
        Collection<Customer> c = listCUSTOMER.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(c);
        return list;
    }
}
