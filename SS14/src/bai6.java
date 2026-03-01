import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Patients {
    String name;
    int age;
    String khoa;

    public Patients(String name, int age, String khoa) {
        this.name = name;
        this.age = age;
        this.khoa = khoa;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuoi)";
    }
}

public class bai6 {
    public static void main(String[] args) {

        List<Patients> danhSachBenhNhan = new ArrayList<>();
        danhSachBenhNhan.add(new Patients("Lan", 30, "Tim mach"));
        danhSachBenhNhan.add(new Patients("Hung", 45, "Noi tiet"));
        danhSachBenhNhan.add(new Patients("Mai", 25, "Tim mach"));
        danhSachBenhNhan.add(new Patients("An", 60, "Tim mach"));

        Map<String, List<Patients>> benhNhanTheoKhoa = new HashMap<>();

        for (Patients p : danhSachBenhNhan) {
            if (!benhNhanTheoKhoa.containsKey(p.khoa)) {
                benhNhanTheoKhoa.put(p.khoa, new ArrayList<>());
            }
            benhNhanTheoKhoa.get(p.khoa).add(p);
        }

        System.out.println("Danh sach benh nhan theo khoa:");
        for (String khoa : benhNhanTheoKhoa.keySet()) {
            System.out.println("Khoa: " + khoa);
            for (Patients p : benhNhanTheoKhoa.get(khoa)) {
                System.out.println("  - " + p);
            }
        }
    }
}