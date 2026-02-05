public class kha1 {
    static class Person {
        protected String fullName;
        protected int age;

        public Person() {
        }

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Họ tên: " + fullName);
            System.out.println("Tuổi: " + age);
        }
    }

    static class Student extends Person {
        private String studentId;
        private double avgScore;

        public Student() {
        }

        public Student(String fullName, int age, String studentId, double avgScore) {
            super(fullName, age);
            this.studentId = studentId;
            this.avgScore = avgScore;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Mã sinh viên: " + studentId);
            System.out.println("Điểm trung bình: " + avgScore);
        }
    }

    public static void main(String[] args) {
        Student sv = new Student("Nguyễn Văn A", 20, "SV001", 8.5);
        sv.displayInfo();
    }
}
