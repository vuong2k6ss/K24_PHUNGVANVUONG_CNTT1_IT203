import java.util.Scanner;
public class gioi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //nhập dữ liệu
        System.out.print("Nhập giá sách (USD - kiểu double): ");
        double usdPrice = sc.nextDouble();

        System.out.print("Nhập tỷ giá (kiểu float): ");
        float exchangeRate = sc.nextFloat();

        //tính giá chính xác (double)
        double vndExact = usdPrice * exchangeRate;
        System.out.println("Giá chính xác (số thực): " + vndExact);

        //ep kiểu từ double sang long để lấy số tiền chẵn
        long vndRounded = (long) vndExact;
        System.out.println("Giá làm tròn để thanh toán (long): " + vndRounded);

    }
}
