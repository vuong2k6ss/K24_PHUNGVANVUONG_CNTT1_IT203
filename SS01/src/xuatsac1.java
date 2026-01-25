import java.util.Scanner;

public class xuatsac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách (4 chữ số): ");
        int code = sc.nextInt();

        //tách các chữ số (ko dùng String)
        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        //tính tổng 3 chữ số đầu
        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        //chữ số kiểm tra kỳ vọng
        int expectedDigit = sumOfFirstThreeNumber % 10;

        System.out.println("Chữ số kiểm tra kỳ vọng: " + expectedDigit);

        //kiểm tra hợp lệ
        boolean isValid = expectedDigit == units;

        if (isValid) {
            System.out.println("Kết quả kiểm tra mã sách: HỢP LỆ");
        } else {
            System.out.println("Kết quả kiểm tra mã sách: SAI MÃ");
        }

    }
}
