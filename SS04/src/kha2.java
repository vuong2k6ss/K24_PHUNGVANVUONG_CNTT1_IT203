public class kha2 {
    public static void main(String[] args) {

        String des = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        if (des.contains("Kệ:")) {                           // kiểm tra có "Kệ:"
            int i = des.indexOf("Kệ:") + 3;                  // vị trí sau "Kệ:"
            int j = des.indexOf(",", i);                     // dấu phẩy tiếp theo

            String pos = (j == -1)
                    ? des.substring(i).trim()               // không có dấu phẩy
                    : des.substring(i, j).trim();            // có dấu phẩy

            System.out.println("Vị trí tìm thấy: " + pos);   // in vị trí

            des = des.replace("Kệ:", "Vị trí lưu trữ:");     // thay từ khóa
            System.out.println("Mô tả mới: " + des);         // in mô tả mới
        }
    }
}
