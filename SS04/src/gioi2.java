public class gioi2 {
    public static void main(String[] args) {
        String cardID = "TV202312345";
        //regex: bắt đầu bằng TV, sau đó 4 số, cuối cùng 5 số
        String regex = "^TV\\d{4}\\d{5}$";

        if (!cardID.startsWith("TV")) { // kiểm tra có bắt đầu bằng TV không
            System.out.println("Thiếu tiền tố TV");
        }
        else if (!cardID.matches(regex)) {// kiểm tra toàn bộ định dạng bằng regex
            System.out.println("Năm không hợp lệ hoặc sai định dạng");
        }
        else {
            System.out.println("Mã thẻ hợp lệ!");
        }
    }
}
