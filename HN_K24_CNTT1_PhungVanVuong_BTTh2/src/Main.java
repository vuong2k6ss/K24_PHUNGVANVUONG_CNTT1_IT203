import java.util.Scanner;

class studentManagement {
    private int ad;
    private String fullname;
    private double score;

    public studentManagement() {
    }

    public studentManagement(int ad, String fullname, double score) {
        this.ad = ad;
        this.fullname = fullname;
        this.score = score;
    }

    public int getAd() {
        return ad;
    }

    public void setAd(int ad) {
        this.ad = ad;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

    public String toString() {
        return ad + " | " + fullname + " | " + score + " | " + getRank();
    }
}


public class Main {
    static studentManagement[] students = new studentManagement[100];
    static int count = 0;

    static void inputStudents(Scanner sc) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            System.out.print("Mã SV (số): ");
            int ad = sc.nextInt();
            sc.nextLine();

            System.out.print("Họ tên: ");
            String fullname = sc.nextLine();

            double score;
            while (true) {
                System.out.print("Điểm TB: ");
                score = sc.nextDouble();
                sc.nextLine();
                if (score >= 0 && score <= 10) break;
                System.out.println("Điểm phải từ 0 đến 10!");
            }

            students[count++] = new studentManagement(ad, fullname, score);
        }
    }

    static void showStudents() {
        if (count == 0) {
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("Mã | Họ tên | Điểm | Học lực");
        for (int i = 0; i < count; i++) {
            System.out.println(students[i]);
        }
    }

    static void searchByRank(Scanner sc) {
        System.out.print("Nhập học lực cần tìm (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (students[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(students[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    static void sortByRankDesc() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (rankValue(students[j]) < rankValue(students[j + 1])) {
                    studentManagement temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    static int rankValue(studentManagement s) {
        if (s.getRank().equals("Gioi")) return 3;
        if (s.getRank().equals("Kha")) return 2;
        return 1;
    }


    static void showMenu() {
        System.out.println("\n===== QUẢN LÝ ĐIỂM SINH VIÊN =====");
        System.out.println("1. Nhập danh sách sinh viên");
        System.out.println("2. Hiển thị danh sách sinh viên");
        System.out.println("3. Tìm kiếm sinh viên theo học lực");
        System.out.println("4. Sắp xếp theo học lực giảm dần");
        System.out.println("5. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            showMenu();
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    inputStudents(sc);
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchByRank(sc);
                    break;
                case 4:
                    sortByRankDesc();
                    System.out.println("Đã sắp xếp xong!");
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, hãy chọn lại");
            }
        } while (choice != 5);
    }
}
