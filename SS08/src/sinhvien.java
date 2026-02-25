import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private String studentId;
    private int age;
    private double score;

    public Student(String name, String studentId, int age, double score) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Mã SV: " + studentId + ", Tên: " + name + ", Tuổi: " + age + ", Điểm: " + score;
    }
}

public class sinhvien {

    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    // Chức năng 1: Thêm sinh viên
    public static void addStudent() {
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập mã sinh viên: ");
        String studentId = scanner.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = scanner.nextInt();
        System.out.print("Nhập điểm sinh viên: ");
        double score = scanner.nextDouble();
        scanner.nextLine();  // Đọc bỏ dòng mới sau khi nhập số

        Student student = new Student(name, studentId, age, score);
        studentList.add(student);
        System.out.println("Sinh viên đã được thêm thành công!");
    }

    // Chức năng 2: Hiển thị danh sách sinh viên
    public static void showStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên rỗng!");
        } else {
            System.out.println("Danh sách sinh viên:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    // Chức năng 3: Tìm sinh viên theo mã sinh viên
    public static void searchStudentById() {
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String studentId = scanner.nextLine();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                System.out.println("Sinh viên tìm thấy: " + student);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên với mã này.");
        }
    }

    // Chức năng 4: Sắp xếp sinh viên theo tên từ A -> Z
    public static void sortStudentsByName() {
        studentList.sort((student1, student2) -> student1.getName().compareToIgnoreCase(student2.getName()));
        System.out.println("Danh sách sinh viên đã được sắp xếp theo tên.");
    }

    // Chức năng 5: Xóa sinh viên theo mã sinh viên
    public static void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String studentId = scanner.nextLine();

        boolean removed = studentList.removeIf(student -> student.getStudentId().equalsIgnoreCase(studentId));
        if (removed) {
            System.out.println("Sinh viên đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với mã này.");
        }
    }

    // Hàm hiển thị menu
    public static void showMenu() {
        System.out.println("Chọn chức năng:");
        System.out.println("1. Thêm sinh viên mới");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm sinh viên theo mã sinh viên");
        System.out.println("4. Sắp xếp sinh viên theo tên từ A -> Z");
        System.out.println("5. Xóa sinh viên");
        System.out.println("6. Thoát");
    }

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc bỏ dòng mới sau khi nhập số

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchStudentById();
                    break;
                case 4:
                    sortStudentsByName();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Thoát chương trình...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}