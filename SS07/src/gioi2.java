class ClassRoom {
    //biến static quỹ lớp
    private static double classFund = 0;
    //biến instance tên sinh viên
    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    //phương thức đóng tiền vào quỹ
    public void donate(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " đã đóng " + amount + " vào quỹ lớp.");
        } else {
            System.out.println("Số tiền không hợp lệ!");
        }
    }

    public static void showClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}

public class gioi2 {
        public static void main(String[] args) {
            ClassRoom s1 = new ClassRoom("Nguyễn Văn An");
            ClassRoom s2 = new ClassRoom("Trần Thị Bình");
            ClassRoom s3 = new ClassRoom("Lê Văn Cường");
            s1.donate(100000);
            s2.donate(150000);
            s3.donate(200000);

            ClassRoom.showClassFund();
        }
}
