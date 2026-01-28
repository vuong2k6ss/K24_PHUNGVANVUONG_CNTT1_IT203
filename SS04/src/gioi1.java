public class gioi1 {
    public static void main(String[] args) {

        String[] transactions = {
                "BK001-20/01",
                "BK005-21/01",
                "BK099-22/01"
        };

        long start1 = System.currentTimeMillis(); // lấy thời gian bắt đầu
        StringBuilder report = new StringBuilder(); //stringbuilder để nối chuỗi
        report.append("--- BAO CAO MUON SACH ---\n");
        report.append("Ngay tao: 24/01/2026\n");

        for (int i = 0; i < transactions.length; i++) {
            report.append("Giao dich: ")
                    .append(transactions[i]) // thêm mã giao dịch
                    .append("\n");
        }

        long end1 = System.currentTimeMillis();// lấy thời gian kết thúc
        long timeBuilder = end1 - start1; // tính thời gian chạy

        long start2 = System.currentTimeMillis();// thời gian bắt đầu

        String report2 = "";// chuỗi rỗng ban đầu
        report2 += "--- BAO CAO MUON SACH ---\n";// nối tiêu đề
        report2 += "Ngay tao: 24/01/2026\n";// nối ngày tạo

        for (int i = 0; i < transactions.length; i++) { // duyệt mảng
            report2 += "Giao dich: " + transactions[i] + "\n"; // nối giao dịch
        }

        long end2 = System.currentTimeMillis();// thời gian kết thúc
        long timeString = end2 - start2;// tính thời gian chạy

        // ===== in kết quả =====
        System.out.println(report.toString());
        System.out.println("Thoi gian StringBuilder: " + timeBuilder);
        System.out.println("Thoi gian String: " + timeString);
    }
}
