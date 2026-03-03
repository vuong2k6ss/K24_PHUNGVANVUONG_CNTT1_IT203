import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

interface IRepository<T>{
    boolean add(T item);
    boolean removeById(String id);
    T findById(String id);
    List<T> findAll();
}

abstract class Product{
    protected String id;
    protected  String name;
    protected  double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateFinalPrice();

    public abstract void displayInfo();
}

abstract class EletronicProduct extends Product{
    private int warrantyMonths;
    public EletronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice(){
        if(warrantyMonths > 12){
            return price + 1000000;
        }else {
            return price;
        }
    }

    @Override
    public void displayInfo(){
        System.out.println("thông tin sản phẩm");
        System.out.println("id: "+id);
        System.out.println("têm: "+name);
        System.out.println("giá: "+price);
        System.out.println("số tháng bảo hành: "+warrantyMonths);
    }
}

abstract class FoodProduct extends Product{
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice(){
        return price - (price * discountPercent / 100);
    }

    @Override
    public void displayInfo(){
        System.out.println("thông tin sản phẩm");
        System.out.println("id: "+id);
        System.out.println("têm: "+name);
        System.out.println("giá: "+price);
        System.out.println("phần trăm tăng giá: "+discountPercent);
    }
}

public class ProductRepository implements IRepository<Product>{
    private List<Product> productlist = new ArrayList<>();
    private Map<String ,Product> map = new HashMap<>();
    

}

public class Main {
    public static void main(String[] args) {

    }
}