import java.util.Scanner;
public class xuatsac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int tong = 0;
        int soNgayMoCua = 0;
        String[] days = {"Thu 2", "Thu 3", "Thu 4","Thu 5", "Thu 6", "Thu 7", "Chu Nhat"};
        for (int i = 0; i < 7; i++) {
            System.out.print("Nhap luot muon ngay " + days[i] + ": ");
            int luotMuon = sc.nextInt();
            // Nếu ngày không mở cửa
            if (luotMuon == 0) {
                continue;
            }
            // Cộng để tính trung bình
            tong += luotMuon;
            soNgayMoCua++;
            // Tìm max
            if (luotMuon > max) {
                max = luotMuon;
            }
            // Tìm min
            if (luotMuon < min) {
                min = luotMuon;
            }
        }

        System.out.println("\n--- KET QUA THONG KE ---");
        if (soNgayMoCua > 0) {
            double trungBinh = (double) tong / soNgayMoCua;

            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh luot muon/ngay: " + trungBinh);
        } else {
            System.out.println("Khong co ngay nao mo cua!");
        }
    }
}
