class Student {
    private String studentId;
    private String studentName;
    private static int totalStudent = 0;

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++; // mỗi lần tạo sinh viên mới thì tăng
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

}


public class kha1 {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Nguyễn Văn An");
        Student s2 = new Student("SV002", "Trần Thị Bình");
        Student s3 = new Student("SV003", "Lê Văn Cường");
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();
        System.out.println();
        s3.displayInfo();
        System.out.println();
        Student.displayTotalStudent();
    }
}
