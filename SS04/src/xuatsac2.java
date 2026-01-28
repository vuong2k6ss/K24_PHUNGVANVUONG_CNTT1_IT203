import java.util.regex.*;

public class xuatsac2 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";
        String[] blacklist = {"tệ", "ngu ngốc", "không đáng đọc"};

        for (int i = 0; i < blacklist.length; i++) {
            //lấy từ nhạy cảm hiện tại
            String word = blacklist[i];
            //Tạo regex không phân biệt hoa thường
            Pattern pattern = Pattern.compile("(?i)" + word);
            //Tạo matcher để tìm trong review
            Matcher matcher = pattern.matcher(review);
            //Tạo chuỗi **** có độ dài bằng từ nhạy cảm
            String stars = "";
            for (int j = 0; j < word.length(); j++) {
                stars += "*";
            }
            // Thay thế từ nhạy cảm bằng ****
            review = matcher.replaceAll(stars);
        }

        //review dài hơn 200 ký tự thì cắt
        if (review.length() > 200) {
            //Cắt trước 200 ký tự
            String temp = review.substring(0, 200);
            // Tìm vị trí khoảng trắng cuối cùng
            int lastSpace = temp.lastIndexOf(" ");
            // Tạo StringBuilder để nối chuỗi
            StringBuilder sb = new StringBuilder();
            // Cắt tới từ hoàn chỉnh cuối cùng
            sb.append(temp.substring(0, lastSpace));
            // Thêm dấu ...
            sb.append("...");
            // Gán lại review
            review = sb.toString();
        }
        System.out.println("Review sau khi xử lý: " + review);
    }
}
