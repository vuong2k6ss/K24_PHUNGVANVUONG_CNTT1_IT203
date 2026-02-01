 class Student {
    private String maSV;
    private String hoTen;
    private int namSinh;
    private double diemTB;

    public Student(String maSV, String hoTen, int namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }


    public void hienThiThongTin() {
        System.out.println("Mã SV: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm TB: " + diemTB);
        System.out.println();
    }
}

public class kha1 {
    public static void main(String[] args) {
        Student sv1 = new Student("SV001", "Nguyễn Văn An", 2003, 8.5);
        Student sv2 = new Student("SV002", "Trần Thị Bình", 2004, 7.8);
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
