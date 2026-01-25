import java.util.Scanner;
public class kha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ: ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn: ");
        int m = sc.nextInt();

        // phạt gốc
        double fine = n * m * 5000;
        System.out.println("Tiền phạt gốc: " + fine + " VND");

        // điều kiện tăng phạt
        if (n > 7 && m >= 3) {
            fine = fine * 1.2; // tăng 20%
        }

        System.out.println("Tiền phạt sau điều chỉnh: " + fine + " VND");

        //kiểm tra yêu cầu khóa thẻ
        boolean blockCard = fine > 50000;
        System.out.println("Yêu cầu khóa thẻ: " + blockCard);
    }
}
