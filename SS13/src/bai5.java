import java.util.*;
public class bai5 {
    static class Patient {
        private String id;
        private String fullName;
        private int age;
        private String diagnosis;

        public Patient(String id, String fullName, int age, String diagnosis) {
            this.id = id;
            this.fullName = fullName;
            this.age = age;
            this.diagnosis = diagnosis;
        }

        public String getId() { return id; }
        public String getFullName() { return fullName; }
        public int getAge() { return age; }
        public String getDiagnosis() { return diagnosis; }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | FullName: " + fullName +
                    " | Age: " + age +
                    " | Diagnosis: " + diagnosis;
        }
    }

    //Danh sách bệnh nhân
    static ArrayList<Patient> patientList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách bệnh nhân");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: addPatient(); break;
                case 2: updateDiagnosis(); break;
                case 3: dischargePatient(); break;
                case 4: sortPatients(); break;
                case 5: displayPatients(); break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1Thêm bệnh nhân
    static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        //Kiểm tra ID trùng
        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.println("ID đã tồn tại!");
                return;
            }
        }
        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = scanner.nextLine();
        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm bệnh nhân thành công.");
    }

    // 2️Cập nhật chẩn đoán
    static void updateDiagnosis() {
        System.out.print("Nhập ID cần cập nhật: ");
        String id = scanner.nextLine();

        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                System.out.print("Nhập chẩn đoán mới: ");
                p.setDiagnosis(scanner.nextLine());
                System.out.println("Cập nhật thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân.");
    }

    // 3Xuất viện
    static void dischargePatient() {
        System.out.print("Nhập ID cần xuất viện: ");
        String id = scanner.nextLine();
        Iterator<Patient> iterator = patientList.iterator();

        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.getId().equals(id)) {
                iterator.remove();
                System.out.println("Đã xuất viện.");
                return;
            }
        }

        System.out.println("Không tìm thấy bệnh nhân.");
    }

    // 4️Sắp xếp theo tuổi giảm dần, nếu bằng thì theo tên A-Z
    static void sortPatients() {
        Collections.sort(patientList, new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                // Tuổi giảm dần
                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge();
                }

                // Nếu tuổi bằng nhau → so tên A-Z
                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Danh sách đã được sắp xếp.");
    }

    // 5️Hiển thị
    static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        System.out.println("\n----- Danh sách bệnh nhân -----");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }
}