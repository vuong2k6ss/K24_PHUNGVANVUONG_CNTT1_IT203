import java.util.Scanner;

public class HN_KS24_CNTT1_BTTH1 {
    static String[] listIdStudent = new String[100];
    static int count = 0; // số MSSV hiện có
    public static void display() {
        if (count == 0) {
            System.out.println("Danh sách MSSV đang trống!");
            return;
        }
        System.out.println("Danh sách MSSV:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + listIdStudent[i]);
        }
    }

    public static void add(Scanner sc) {
        if (count == 100) {
            System.out.println("Danh sách đã đầy!");
            return;
        }
        String mssv;
        while (true) {
            System.out.print("Nhập MSSV (Bxxxxxxx): ");
            mssv = sc.nextLine();
            // Regex: B + 7 chữ số
            if (mssv.matches("^B\\d{7}$")) {
                break;
            } else {
                System.out.println("Sai định dạng! Nhập lại.");
            }
        }
        listIdStudent[count] = mssv;
        count++;
        System.out.println("Thêm MSSV thành công!");
    }

    public static void update(Scanner sc) {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.print("Nhập vị trí cần sửa (1 - " + count + "): ");
        int index = Integer.parseInt(sc.nextLine());
        // kiểm tra index hợp lệ
        if (index < 1 || index > count) {
            System.out.println("Vị trí không hợp lệ!");
            return;
        }
        String newMssv;
        while (true) {
            System.out.print("Nhập MSSV mới: ");
            newMssv = sc.nextLine();

            if (newMssv.matches("^B\\d{7}$")) {
                break;
            } else {
                System.out.println("Sai định dạng! Nhập lại.");
            }
        }
        listIdStudent[index - 1] = newMssv;
        System.out.println("Cập nhật thành công!");
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Hiển thị danh sách MSSV");
            System.out.println("2. Thêm mới MSSV");
            System.out.println("3. Cập nhật MSSV");
            System.out.println("4. Xóa MSSV");
            System.out.println("5. Tìm kiếm MSSV");
            System.out.println("6. Thoát");
            System.out.print("Nhập lựa chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    display();
                    break;
                case 2:
                    add(sc);
                    break;
                case 3:
                    update(sc);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);
    }
}
