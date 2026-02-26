import java.util.*;
public class bai6 {
    static class Medicine {
        private String drugId;
        private String drugName;
        private double unitPrice;
        private int quantity;

        public Medicine(String drugId, String drugName, double unitPrice, int quantity) {
            this.drugId = drugId;
            this.drugName = drugName;
            this.unitPrice = unitPrice;
            this.quantity = quantity;
        }

        public String getDrugId() { return drugId; }
        public String getDrugName() { return drugName; }
        public double getUnitPrice() { return unitPrice; }
        public int getQuantity() { return quantity; }

        public void setQuantity(int quantity) { this.quantity = quantity; }

        public double getTotalPrice() {
            return unitPrice * quantity;
        }
    }

    //Danh sách thuốc
    static List<Medicine> medicineList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=========== MENU ===========");
            System.out.println("1. Thêm thuốc vào đơn");
            System.out.println("2. Điều chỉnh số lượng");
            System.out.println("3. Xóa thuốc");
            System.out.println("4. In hóa đơn");
            System.out.println("5. Tìm thuốc giá rẻ");
            System.out.println("6. Thoát");
            System.out.print("Chọn lựa chọn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: addMedicine(); break;
                case 2: updateQuantity(); break;
                case 3: removeMedicine(); break;
                case 4: printInvoice(); break;
                case 5: findCheapMedicine(); break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1Thêm thuốc
    static void addMedicine() {
        System.out.print("Nhập mã thuốc: ");
        String id = scanner.nextLine();

        for (Medicine m : medicineList) {
            if (m.getDrugId().equals(id)) {
                System.out.print("Thuốc đã tồn tại. Nhập số lượng thêm: ");
                int extra = Integer.parseInt(scanner.nextLine());
                m.setQuantity(m.getQuantity() + extra);
                System.out.println("Cập nhật số lượng thành công!");
                return;
            }
        }

        System.out.print("Nhập tên thuốc: ");
        String name = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập số lượng: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        medicineList.add(new Medicine(id, name, price, quantity));
        System.out.println("Thêm thuốc thành công!");
    }

    // 2Điều chỉnh số lượng
    static void updateQuantity() {
        while (true) {
            System.out.print("Nhập mã thuốc: ");
            String id = scanner.nextLine();

            for (Medicine m : medicineList) {
                if (m.getDrugId().equals(id)) {
                    System.out.print("Nhập số lượng mới: ");
                    int newQty = Integer.parseInt(scanner.nextLine());

                    if (newQty == 0) {
                        medicineList.remove(m);
                        System.out.println("Thuốc đã bị xóa do số lượng = 0.");
                    } else {
                        m.setQuantity(newQty);
                        System.out.println("Cập nhật thành công!");
                    }
                    return;
                }
            }
            System.out.println("Thuốc không tồn tại trong đơn.");
        }
    }

    // 3Xóa thuốc
    static void removeMedicine() {
        System.out.print("Nhập mã thuốc cần xóa: ");
        String id = scanner.nextLine();
        Iterator<Medicine> iterator = medicineList.iterator();

        while (iterator.hasNext()) {
            Medicine m = iterator.next();
            if (m.getDrugId().equals(id)) {
                iterator.remove();
                System.out.println("Xóa thuốc thành công!");
                return;
            }
        }

        System.out.println("ID thuốc không tồn tại!");
    }

    // 4In hóa đơn
    static void printInvoice() {
        if (medicineList.isEmpty()) {
            System.out.println("Đơn thuốc trống!");
            return;
        }

        double total = 0;

        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.printf("%-10s %-20s %-10s %-10s %-15s\n",
                "Mã", "Tên thuốc", "Đơn giá", "SL", "Thành tiền");

        for (Medicine m : medicineList) {
            double itemTotal = m.getTotalPrice();
            total += itemTotal;

            System.out.printf("%-10s %-20s %-10.2f %-10d %-15.2f\n",
                    m.getDrugId(),
                    m.getDrugName(),
                    m.getUnitPrice(),
                    m.getQuantity(),
                    itemTotal);
        }

        System.out.println("---------------------------------------------");
        System.out.printf("TỔNG TIỀN: %.2f VNĐ\n", total);
        // Xóa toàn bộ thuốc sau khi in
        medicineList.clear();
        System.out.println("Đơn thuốc đã được làm mới.");
    }

    // 5Tìm thuốc giá rẻ (< 50000)
    static void findCheapMedicine() {
        boolean found = false;

        System.out.println("\n--- Thuốc giá dưới 50.000 VNĐ ---");

        for (Medicine m : medicineList) {
            if (m.getUnitPrice() < 50000) {
                System.out.printf("%-10s %-20s %-10.2f\n",
                        m.getDrugId(),
                        m.getDrugName(),
                        m.getUnitPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có thuốc giá rẻ.");
        }
    }
}