import java.util.Scanner;
public class gioi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;              //số sách trả muộn
        int soNgayTre;      //số ngày trễ của từng cuốn
        int total = 0;      //tổng tiền phạt
        final int PHAT_MOI_NGAY = 5000;
        System.out.print("Nhap so luong sach tra muon: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon thu " + i + ": ");
            soNgayTre = sc.nextInt();
            total += soNgayTre * PHAT_MOI_NGAY;
        }

        System.out.println("===> Tong tien phat: " + total + " VND");

    }
}
