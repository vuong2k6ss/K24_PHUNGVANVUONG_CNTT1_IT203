import java.util.Scanner;

public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi;
        int soSach;
        System.out.print("Nhap tuoi cua ban: ");
        tuoi = sc.nextInt();
        System.out.print("Nhap so sach dang muon: ");
        soSach = sc.nextInt();

        if (tuoi >= 18 && soSach <= 3) {
            System.out.println("Ket qua: Ban DU DIEU KIEN muon sach quy hiem.");
        } else {
            System.out.println("Ket qua: Khong du dieu kien.");

            if (tuoi < 18) {
                System.out.println("- Ly do: Ban phai tu 18 tuoi tro len.");
            } else if (soSach > 3) {
                System.out.println("- Ly do: Ban da muon toi da 3 cuon.");
            }
        }

    }
}
