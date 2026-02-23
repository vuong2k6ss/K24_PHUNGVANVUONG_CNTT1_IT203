import java.util.*;
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class xuatsac2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 600));
        products.add(new Product("Mouse", 50));

        /* SẮP XẾP THEO GIÁ Anonymous Class*/

        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });

        System.out.println("=== Sắp xếp theo giá tăng dần (Anonymous Class) ===");
        for (Product p : products) {
            System.out.println(p);
        }


        /*
           2️⃣ SẮP XẾP THEO TÊN Lambda */

        products.sort((p1, p2) -> p1.name.compareToIgnoreCase(p2.name));
        System.out.println("\n=== Sắp xếp theo tên A-Z (Lambda) ===");
        for (Product p : products) {
            System.out.println(p);
        }


        /* GHI CHÚ:
           Lambda chỉ dùng được khi interface có
           DUY NHẤT 1 phương thức trừu tượng
           (Functional Interface).

           BẮT BUỘC dùng Anonymous Class khi:
           - Cần khai báo thêm biến nội bộ
           - Cần nhiều phương thức
           - Cần override nhiều phương thức
           - Cần logic phức tạp có trạng thái riêng

           Ví dụ: nếu muốn lưu biến "priority"
           bên trong Comparator → phải dùng
           Anonymous Class.*/
    }
}