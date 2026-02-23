import java.util.ArrayList;
import java.util.List;

public class xuatsac1 {
    static abstract class Employee {
        protected String name;
        public Employee(String name) {
            this.name = name;
        }

        public abstract double calculateSalary();
        public String getName() {
            return name;
        }
    }

    static class OfficeEmployee extends Employee {
        private double baseSalary;

        public OfficeEmployee(String name, double baseSalary) {
            super(name);
            this.baseSalary = baseSalary;
        }

        @Override
        public double calculateSalary() {
            return baseSalary;
        }
    }

    static class ProductionEmployee extends Employee {
        private int numOfProducts;
        private double price;
        public ProductionEmployee(String name, int numOfProducts, double price) {
            super(name);
            this.numOfProducts = numOfProducts;
            this.price = price;
        }

        @Override
        public double calculateSalary() {
            return numOfProducts * price;
        }

        public int getNumOfProducts() {
            return numOfProducts;
        }

        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new OfficeEmployee("Nguyen Van A (Office)", 10_000_000));
        employees.add(new ProductionEmployee("Tran Thi B (Production)", 300, 20_000));
        employees.add(new ProductionEmployee("Le Van C (Production)", 150, 30_000));

        double totalSalary = 0;
        System.out.println("Danh sách lương nhân viên:");

        int index = 0;
        for (Employee e : employees) {
            double salary = e.calculateSalary();
            totalSalary += salary;

            if (e instanceof ProductionEmployee) {
                ProductionEmployee p = (ProductionEmployee) e;
                System.out.println(
                        index + ". " + e.getName()
                                + " - Lương: " + String.format("%,.0f", salary)
                                + " (" + p.getNumOfProducts()
                                + " sản phẩm × " + String.format("%,.0f", p.getPrice()) + ")"
                );
            } else {
                System.out.println(
                        index + ". " + e.getName()
                                + " - Lương: " + String.format("%,.0f", salary)
                );
            }
            index++;
        }
        System.out.println("\n=> TỔNG LƯƠNG CÔNG TY: " + String.format("%,.0f", totalSalary));
    }
}
