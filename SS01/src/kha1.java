import java.util.Scanner;
public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhập giá bìa: ");
        double price = sc.nextDouble();

        System.out.print("Sách còn trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        // Tính tuổi thọ sách
        int bookAge = 2026 - publishYear;

        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.println("Mã số: " + bookID + " | Tuổi thọ: " + bookAge + " năm");
        System.out.printf("Giá bán: %.2f VND%n", price);

        if (isAvailable) {
            System.out.println("Tình trạng: Còn sách");
        } else {
            System.out.println("Tình trạng: Đã mượn");
        }


    }
}
