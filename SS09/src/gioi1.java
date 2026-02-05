public class gioi1 {

    static class Employee {
        protected String name;
        protected double basicSalary;
        public Employee(String name, double basicSalary) {
            this.name = name;
            this.basicSalary = basicSalary;
        }

        public void displayInfo() {
            System.out.println("Tên nhân viên: " + name);
            System.out.println("Lương cơ bản: " + basicSalary);
        }
    }

    static class Manager extends Employee {
        private String department;

        public Manager(String name, double basicSalary, String department) {
            super(name, basicSalary);
            this.department = department;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Phòng ban: " + department);
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Nguyễn Văn B", 15000000, "Phòng Kỹ thuật");
        manager.displayInfo();
    }
}
