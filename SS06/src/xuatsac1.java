class Book {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double gia;

    public Book(String maSach, String tenSach, String tacGia, int namXuatBan, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.gia = gia;
    }

    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Giá: " + gia);
    }
}


public class xuatsac1 {
    public static void main(String[] args) {
        Book b = new Book("B01", "Lập trình Java", "Nguyễn Văn A", 2024, 120000);
        b.hienThiThongTin();
    }
}
