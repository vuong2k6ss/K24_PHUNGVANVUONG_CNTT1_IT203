class Product {
    private String maSP;
    private String tenSP;
    private double giaBan;

    public Product(String maSP, String tenSP, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setGiaBan(giaBan); //dùng setter để kiểm tra
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    // Setter giá có kiểm tra
    public void setGiaBan(double giaBan) {
        if (giaBan > 0) {
            this.giaBan = giaBan;
        } else {
            System.out.println("Giá bán không hợp lệ, phải > 0");
        }
    }

    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("---------------------");
    }
}

public class gioi1 {
    public static void main(String[] args) {
        Product p = new Product("SP01", "Bàn phím cơ", 500000);
        p.hienThiThongTin();
        //giá không hợp lệ
        p.setGiaBan(-100000);
        p.hienThiThongTin();
    }
}
