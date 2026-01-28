public class kha1 {

    // loại bỏ khoảng trắng thừa trong chuỗi
    public static String deleteSpaces(String s) {
        s = s.trim(); //bỏ khoảng trắng đầu và cuối
        s = s.replaceAll("\\s+", " "); // gộp nhiều khoảng trắng thành 1
        return s;// trả về chuỗi đã xử lý
    }

    //viết hoa chữ cái đầu mỗi từ
    public static String capitalizeWords(String s) {
        s = deleteSpaces(s);             //làm sạch khoảng trắng
        String[] words = s.split(" ");   //tách chuỗi
        StringBuilder result = new StringBuilder(); //nối chuỗi

        for (String word : words) {
            result.append(
                    Character.toUpperCase(word.charAt(0))// viết hoa chữ cái đầu
                            + word.substring(1).toLowerCase()// phần còn lại viết thường
            ).append(" ");
        }

        return result.toString().trim(); //trả chuỗi kết quả bỏ space cuối
    }

    public static void main(String[] args) {
        String title  = "  lập  TRÌNH   java   cơ   bản  ";
        String author = "nguyễn   văn   a";
        title = deleteSpaces(title).toUpperCase();
        author = capitalizeWords(author);

        System.out.println("[" + title + "] - Tác giả: " + author);
    }
}
