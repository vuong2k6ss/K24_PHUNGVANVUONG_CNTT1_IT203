import java.util.ArrayList;
import java.util.Scanner;

class Fruit {
    private String name;
    private String type;
    private String color;
    private double price;

    public Fruit(String name, String type, String color, double price) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tên quả: " + name + ", Loại quả: " + type + ", Màu sắc: " + color + ", Giá: " + price;
    }
}

public class FruitManagement {

    private static ArrayList<Fruit> fruitList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Chức năng 1: Thêm quả
    public static void addFruit() {
        System.out.print("Nhập tên quả: ");
        String name = scanner.nextLine();
        System.out.print("Nhập loại quả: ");
        String type = scanner.nextLine();
        System.out.print("Nhập màu sắc quả: ");
        String color = scanner.nextLine();
        System.out.print("Nhập giá quả: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng mới sau khi nhập số

        Fruit fruit = new Fruit(name, type, color, price);
        fruitList.add(fruit);
        System.out.println("Quả đã được thêm thành công!");
    }

    // Chức năng 2: Hiển thị danh sách quả
    public static void showFruits() {
        if (fruitList.isEmpty()) {
            System.out.println("Danh sách quả rỗng!");
        } else {
            System.out.println("Danh sách quả:");
            for (Fruit fruit : fruitList) {
                System.out.println(fruit);
            }
        }
    }

    // Chức năng 3: Tìm quả theo tên
    public static void searchFruitByName() {
        System.out.print("Nhập tên quả cần tìm: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Fruit fruit : fruitList) {
            if (fruit.getName().equalsIgnoreCase(name)) {
                System.out.println("Quả tìm thấy: " + fruit);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy quả với tên này.");
        }
    }

    // Chức năng 4: Sắp xếp quả theo tên từ A -> Z
    public static void sortFruitsByName() {
        fruitList.sort((fruit1, fruit2) -> fruit1.getName().compareToIgnoreCase(fruit2.getName()));
        System.out.println("Danh sách quả đã được sắp xếp theo tên.");
    }

    // Chức năng 5: Xóa quả theo tên
    public static void deleteFruit() {
        System.out.print("Nhập tên quả cần xóa: ");
        String name = scanner.nextLine();

        boolean removed = fruitList.removeIf(fruit -> fruit.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Quả đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy quả với tên này.");
        }
    }

    // Hàm hiển thị menu
    public static void showMenu() {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm quả mới");
        System.out.println("2. Hiển thị danh sách quả");
        System.out.println("3. Tìm quả theo tên");
        System.out.println("4. Sắp xếp quả theo tên từ A -> Z");
        System.out.println("5. Xóa quả");
        System.out.println("6. Thoát");
    }

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng mới sau khi nhập số

            switch (choice) {
                case 1:
                    addFruit();
                    break;
                case 2:
                    showFruits();
                    break;
                case 3:
                    searchFruitByName();
                    break;
                case 4:
                    sortFruitsByName();
                    break;
                case 5:
                    deleteFruit();
                    break;
                case 6:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}