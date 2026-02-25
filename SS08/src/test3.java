import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private String name;
    private String type;
    private String color;
    private double price;

    public Car(String name, String type, String color, double price) {
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
        return "Tên xe: " + name + ", Loại xe: " + type + ", Màu sắc: " + color + ", Giá: " + price;
    }
}

public class test3 {

    private static ArrayList<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Chức năng 1: Thêm xe mới
    public static void addCar() {
        System.out.print("Nhập tên xe: ");
        String name = scanner.nextLine();
        System.out.print("Nhập loại xe: ");
        String type = scanner.nextLine();
        System.out.print("Nhập màu sắc xe: ");
        String color = scanner.nextLine();
        System.out.print("Nhập giá xe: ");
        double price = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng mới sau khi nhập số

        Car car = new Car(name, type, color, price);
        carList.add(car);
        System.out.println("Xe đã được thêm thành công!");
    }

    // Chức năng 2: Hiển thị danh sách xe
    public static void showCars() {
        if (carList.isEmpty()) {
            System.out.println("Danh sách xe rỗng!");
        } else {
            System.out.println("Danh sách xe:");
            for (Car car : carList) {
                System.out.println(car);
            }
        }
    }

    // Chức năng 3: Tìm kiếm xe theo tên
    public static void searchCarByName() {
        System.out.print("Nhập tên xe cần tìm: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Car car : carList) {
            if (car.getName().equalsIgnoreCase(name)) {
                System.out.println("Xe tìm thấy: " + car);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy xe với tên này.");
        }
    }

    // Chức năng 4: Sắp xếp xe theo tên từ A -> Z
    public static void sortCarsByName() {
        carList.sort((car1, car2) -> car1.getName().compareToIgnoreCase(car2.getName()));
        System.out.println("Danh sách xe đã được sắp xếp theo tên.");
    }

    // Chức năng 5: Xóa xe theo tên
    public static void deleteCar() {
        System.out.print("Nhập tên xe cần xóa: ");
        String name = scanner.nextLine();

        boolean removed = carList.removeIf(car -> car.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Xe đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy xe với tên này.");
        }
    }

    // Hàm hiển thị menu
    public static void showMenu() {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm xe mới");
        System.out.println("2. Hiển thị danh sách xe");
        System.out.println("3. Tìm kiếm xe theo tên");
        System.out.println("4. Sắp xếp xe theo tên từ A -> Z");
        System.out.println("5. Xóa xe");
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
                    addCar();
                    break;
                case 2:
                    showCars();
                    break;
                case 3:
                    searchCarByName();
                    break;
                case 4:
                    sortCarsByName();
                    break;
                case 5:
                    deleteCar();
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