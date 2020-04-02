
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerData {
    private static Map<Integer, Customer> customers;

    static {
        initData();
    }

    private static void initData() {
        customers = new HashMap<>();
        customers.put(1, new Customer("Trần Ngoc Tân", "02/02/1998", "Đà Nẵng", "img/tan.png"));
        customers.put(2, new Customer("Nguyễn Đình Hòa", "02/08/1994", "Quảng Nam", "img/hoa.png"));
        customers.put(3, new Customer("Lê Đình Quốc", "11/06/1998", "Quảng Nam", "img/quoc.png"));
        customers.put(4,new Customer("Phạm Thái Cường", "09/02/1996", "Nha Trang", "img/cuong.png"));


    }
    // đẻ bảng Department có thể truy vấn.
    public static List<Customer> queryCustomers() {
        return new ArrayList<>(customers.values());
    }
}
