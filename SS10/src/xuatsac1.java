abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

interface BonusCalculator {
    double getBonus();
}

class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // không có thưởng
    }
}

class Manager extends Employee implements BonusCalculator {
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}

public class xuatsac1 {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000000);
        Employee manager = new Manager("Trần Văn B", 15000000, 5000000);

        System.out.println("===== BẢNG LƯƠNG =====");

        System.out.println("Nhân viên: " + staff.name);
        System.out.println("Lương cơ bản: " + staff.baseSalary);
        System.out.println("Thưởng: Không có");
        System.out.println("Tổng lương: " + staff.calculateSalary());
        System.out.println();

        System.out.println("Nhân viên: " + manager.name);
        System.out.println("Lương cơ bản: " + manager.baseSalary);

        // Ép kiểu để lấy thưởng
        if (manager instanceof BonusCalculator) {
            BonusCalculator b = (BonusCalculator) manager;
            System.out.println("Thưởng: " + b.getBonus());
        }

        System.out.println("Tổng lương: " + manager.calculateSalary());
    }
}