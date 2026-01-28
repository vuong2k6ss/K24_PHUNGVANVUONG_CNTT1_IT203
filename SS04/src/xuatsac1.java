import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xuatsac1 {
    public static void main(String[] args) {
        String log = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345";

        //Regex để tách
        String regex = "(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (\\w+) \\| BookID: (\\w+)";

        //Tạo Pattern từ regex
        Pattern pattern = Pattern.compile(regex);

        //Tạo Matcher để so khớp với chuỗi log
        Matcher matcher = pattern.matcher(log);

        //Nếu log khớp với regex
        if (matcher.find()) {

            // Lấy dữ liệu các group
            String date = matcher.group(1);      // Ngày
            String user = matcher.group(2);      // Người dùng
            String action = matcher.group(3);    // Hành động
            String bookId = matcher.group(4);    // Mã sách

            System.out.println("Ngày: " + date);
            System.out.println("Người dùng: " + user);
            System.out.println("Hành động: " + action);
            System.out.println("Mã sách: " + bookId);
        }
    }
}
