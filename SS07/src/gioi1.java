class ScoreUtils {
    //kiểm tra đạt / trượt
    public static boolean checkPass(double score) {
        return score >= 5.0;
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}


public class gioi1 {
    public static void main(String[] args) {
        double[] scores = {6.5, 8.0, 4.5};
        System.out.println("Danh sách điểm: 6.5, 8.0, 4.5");
        System.out.println();

        System.out.println(">> Kết quả xử lý:");
        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("- Điểm trung bình cả lớp: %.2f\n", avg);

        for (double score : scores) {
            boolean pass = ScoreUtils.checkPass(score);
            System.out.println("- Điểm " + score + ": " + (pass ? "Đạt" : "Trượt"));
        }
    }
}
