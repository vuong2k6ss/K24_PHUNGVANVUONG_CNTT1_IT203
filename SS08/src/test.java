import java.util.Scanner;
public class test {
    public static void function1() {
        System.out.println("Chức năng 1: Xử lý dữ liệu A");

    }

    public static void function2() {
        System.out.println("Chức năng 2: Xử lý dữ liệu B");
    }

    public static void function3() {
        System.out.println("Chức năng 3: Xử lý dữ liệu C");
    }

    // Hàm hiển thị menu
    public static void showMenu() {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Chức năng 1");
        System.out.println("2. Chức năng 2");
        System.out.println("3. Chức năng 3");
        System.out.println("4. Thoát");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    function1();
                    break;
                case 2:
                    function2();
                    break;
                case 3:
                    function3();
                    break;
                case 4:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}