import java.util.Date;

public class Customer {
    private String name;
    private String ngaysinh;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(String name, String ngaysinh, String address, String image) {
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
