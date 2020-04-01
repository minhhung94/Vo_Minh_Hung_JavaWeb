package dao;

import model.Customer;

import java.util.*;

public class Customerdao {
    private static final Map<Integer, Customer>  listCUSTOEMR= new HashMap<Integer, Customer>();

    static {
        initCustomers();
    }

    private static void initCustomers(){
        Customer cus1 = new Customer(1,"Le Dinh Quoc","098752221","dinhquoc@gmail.com","Da nang");
        Customer cus2 = new Customer(2,"Nguyen Duc Thong","088752221","thongnguyen@gmail.com","Hue");
        Customer cus3 = new Customer(3,"Le Hoang Long","0977521231","longle@gmail.com","Quang Nam");
        Customer cus4 = new Customer(4,"Pham Thai Cuong","078752244","thaicuong@gmail.com","Nghe An");

        listCUSTOEMR.put(cus1.getId(),cus1);
        listCUSTOEMR.put(cus2.getId(),cus2);
        listCUSTOEMR.put(cus3.getId(),cus3);
        listCUSTOEMR.put(cus4.getId(),cus4);
    }
// get thông tin chi tiết của 1 custoemr theo id
    public static Customer getCustomer(int customerId){
        return listCUSTOEMR.get(customerId);
    }

    public  static void addCustomer(Customer customer){
        listCUSTOEMR.put(customer.getId(),customer);
    }

    //update thông tin 1 customer
    public static Customer updateCustomer(Customer customer){
        listCUSTOEMR.put(customer.getId(),customer);
        return customer;
    }

    public static void  deleteCustomer(int customerId){
        listCUSTOEMR.remove(customerId);
    }

    public static List<Customer> getAllCustomer(){
        Collection<Customer> cus = listCUSTOEMR.values();
        List<Customer> list = new ArrayList<Customer>();
        list.addAll(cus);
        return list;
    }
}
