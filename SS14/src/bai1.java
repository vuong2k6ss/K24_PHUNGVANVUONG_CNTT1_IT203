import java.util.LinkedHashSet;
import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {

        String[] input = {
                "Nguyễn Văn A – Yên Bái",
                "Trần Thị B – Thái Bình",
                "Nguyễn Văn A – Yên Bái",
                "Lê Văn C – Hưng Yên"
        };
        // Dùng LinkedHashSet để vừa không trùng vừa giữ thứ tự
        LinkedHashSet<String> danhSach = new LinkedHashSet<>(Arrays.asList(input));

        System.out.println("Danh sách gọi khám:");
        for (String ten : danhSach) {
            System.out.println(ten);
        }
    }
}