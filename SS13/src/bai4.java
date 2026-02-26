import java.util.LinkedList;

public class bai4 {

    private LinkedList<String> waitingList = new LinkedList<>();

    // Bệnh nhân thường thêm vào cuối hàng đợi
    public void patientCheckIn(String name) {
        waitingList.addLast(name);
        System.out.println(name + " đã check-in (thường).");
    }

    // Ca cấp cứu thêm vào đầu hàng đợi
    public void emergencyCheckIn(String name) {
        waitingList.addFirst(name);
        System.out.println(name + " đã check-in (CẤP CỨU).");
    }

    // Gọi bệnh nhân đầu tiên vào khám
    public void treatPatient() {
        if (waitingList.isEmpty()) {
            System.out.println("Không còn bệnh nhân.");
            return;
        }

        String patient = waitingList.removeFirst();
        System.out.println("Đang khám: " + patient);
    }

    public static void main(String[] args) {
        bai4 er = new bai4();
        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        System.out.println("\nBác sĩ bắt đầu khám");
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}