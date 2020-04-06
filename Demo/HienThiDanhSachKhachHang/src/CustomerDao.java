import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerDao {
    private static final List<Customer> listCustomer = new ArrayList<Customer>();
    static {
        initData();
    }
    private static void initData() {
        Customer cus1 = new Customer("Pham Thai Cuong", "Da Nang", "img/1.png", "15/06/1998");
        Customer cus2 = new Customer("Nguyen Dinh Hoa", "Quang Nam", "img/2.png", "20/04/1994");
        Customer cus3 = new Customer("Gau Bong 1", "Tokyo", "img/3.png", "10/07/1994");
        Customer cus4 = new Customer("Gau Bong 2", "Korean", "img/4.png", "16/08/1993");
        Customer cus5 = new Customer("Eimi Fukada", "Tochigi", "img/5.png", "18/03/1998");
        listCustomer.add(cus1);
        listCustomer.add(cus2);
        listCustomer.add(cus3);
        listCustomer.add(cus4);
        listCustomer.add(cus5);

    }
    // Truy vấn bảng Department.
    public static List<Customer> getAllCustomer() {
        return listCustomer;
    }

}
