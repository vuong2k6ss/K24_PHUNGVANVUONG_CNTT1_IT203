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

class ElectronicProduct extends Product{
    private int warrantyMonths;
    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
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

class FoodProduct extends Product{
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

class ProductRepository implements IRepository<Product>{

    private List<Product> productList = new ArrayList<>();
    private Map<String, Product> map = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if(item == null || map.containsKey(item.getId())){
            return false;
        }
        productList.add(item);
        map.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if(id == null || !map.containsKey(id)){
            return false;
        }
        Product p = map.remove(id);
        productList.remove(p);
        return true;
    }

    @Override
    public Product findById(String id) {
        if(id == null){
            return null;
        }
        return map.get(id);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }
}

public class Main {
    public static void main(String[] args) {

        ProductRepository repo = new ProductRepository();

        // Thêm sản phẩm
        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Tai nghe", 2000000, 6));
        repo.add(new FoodProduct("F01", "Bánh", 50000, 10));
        repo.add(new FoodProduct("F02", "Sữa", 30000, 5));

        // Hiển thị toàn bộ
        System.out.println("===== DANH SÁCH SẢN PHẨM =====");
        for(Product p : repo.findAll()){
            p.displayInfo();
            System.out.println("Thành tiền: " + p.calculateFinalPrice());
            System.out.println("-----------------------");
        }

        // Tìm theo ID
        System.out.println("===== TÌM SẢN PHẨM E01 =====");
        Product found = repo.findById("E01");
        if(found != null){
            found.displayInfo();
        } else {
            System.out.println("Không tìm thấy");
        }

        // Sắp xếp theo giá tăng dần
        System.out.println("===== SẮP XẾP THEO GIÁ =====");
        List<Product> list = repo.findAll();
        Collections.sort(list, Comparator.comparingDouble(Product::getPrice));

        for(Product p : list){
            System.out.println(p.getId() + " - " + p.getPrice());
        }

        // Thống kê theo loại
        System.out.println("===== THỐNG KÊ =====");
        Map<String, Integer> stats = new HashMap<>();

        for(Product p : repo.findAll()){
            String type = p.getClass().getSimpleName();
            stats.put(type, stats.getOrDefault(type, 0) + 1);
        }

        System.out.println(stats);
    }
}