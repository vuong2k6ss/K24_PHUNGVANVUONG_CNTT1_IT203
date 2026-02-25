import java.util.Arrays;
import java.util.Scanner;

public class test2 {

    // Chức năng 1: Phân loại và tách nhóm ký tự
    public static void function1() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine().toLowerCase();

        // Khởi tạo chuỗi chứa nguyên âm và phụ âm
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        // Duyệt qua từng ký tự trong chuỗi
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Kiểm tra nếu là chữ cái
                if ("aeiou".indexOf(c) >= 0) {
                    vowels.append(c); // Nguyên âm
                } else {
                    consonants.append(c); // Phụ âm
                }
            }
        }

        // In kết quả
        System.out.println("Nguyên âm: " + vowels);
        System.out.println("Phụ âm: " + consonants);
    }

    // Chức năng 2: Tìm ký tự xuất hiện nhiều nhất
    public static void function2() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine().toLowerCase();

        int[] frequency = new int[26]; // Mảng để đếm tần suất của các chữ cái

        // Duyệt qua từng ký tự trong chuỗi
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) { // Nếu là chữ cái
                frequency[c - 'a']++;
            }
        }

        // Tìm ký tự xuất hiện nhiều nhất
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < 26; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) (i + 'a');
            }
        }

        // In kết quả
        System.out.println(maxChar + " (xuất hiện " + maxCount + " lần)");
    }

    // Chức năng 3: Xóa và Dịch chuyển (Delete & Shift Left)
    public static void function3() {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Nhập giá trị x
        System.out.print("Nhập giá trị cần xóa: ");
        int x = scanner.nextInt();

        // Xóa giá trị x trong mảng và dịch chuyển
        int writeIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != x) {
                arr[writeIndex++] = arr[i];
            }
        }

        // In mảng sau khi xóa
        System.out.print("Mảng sau khi xóa: ");
        for (int i = 0; i < writeIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Kích thước mảng mới: " + writeIndex);
    }

    // Chức năng 4: Nhập các phần tử vào mảng
    public static int[] function4() {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Nhập số phần tử mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Chức năng 5: Hiển thị các phần tử của mảng
    public static void function5(int[] arr) {
        System.out.print("Các phần tử trong mảng: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Chức năng 6: Sắp xếp mảng sử dụng Bubble Sort
    public static void function6(int[] arr) {
        int n = arr.length;
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Mảng sau khi sắp xếp (Bubble Sort): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Chức năng 7: Sắp xếp chuỗi theo tên từ A -> Z
    public static void function7() {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();

        // Tách chuỗi thành các từ
        String[] words = input.split("\\s+");

        // Sắp xếp các từ theo thứ tự từ A -> Z
        Arrays.sort(words);

        System.out.println("Chuỗi sau khi sắp xếp từ A -> Z: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    // Hàm hiển thị menu
    public static void showMenu() {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Chức năng 1: Xử lý chuỗi (Nguyên âm và Phụ âm)");
        System.out.println("2. Chức năng 2: Xử lý chuỗi (Ký tự xuất hiện nhiều nhất)");
        System.out.println("3. Chức năng 3: Xóa phần tử trong mảng");
        System.out.println("4. Chức năng 4: Nhập các phần tử vào mảng");
        System.out.println("5. Chức năng 5: Hiển thị các phần tử trong mảng");
        System.out.println("6. Chức năng 6: Sắp xếp mảng (Bubble Sort)");
        System.out.println("7. Chức năng 7: Sắp xếp chuỗi theo tên từ A -> Z");
        System.out.println("8. Thoát");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = null;  // Mảng được sử dụng cho các chức năng nhập, hiển thị, sắp xếp.
        int choice;

        do {
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ ký tự xuống dòng sau khi nhập số

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
                    arr = function4();  // Lưu mảng được nhập vào
                    break;
                case 5:
                    if (arr != null) {
                        function5(arr);  // Hiển thị mảng nếu đã nhập
                    } else {
                        System.out.println("Bạn chưa nhập mảng.");
                    }
                    break;
                case 6:
                    if (arr != null) {
                        function6(arr);  // Sắp xếp mảng bằng Bubble Sort nếu đã nhập
                    } else {
                        System.out.println("Bạn chưa nhập mảng.");
                    }
                    break;
                case 7:
                    function7();  // Sắp xếp chuỗi theo từ A -> Z
                    break;
                case 8:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}