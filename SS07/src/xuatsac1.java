class Main {
    //lớp config
    static class Config {
        public static final double MAX_SCORE = 10.0;
        public static final double MIN_SCORE = 0.0;
    }

    //xử lý điiểm
    static class ScoreUtils {
        public static boolean isValidScore(double score) {
            return score >= Config.MIN_SCORE && score <= Config.MAX_SCORE;
        }
    }
}


public class xuatsac1 {
    public static void main(String[] args) {
        double score = 18.5;

        if (Main.ScoreUtils.isValidScore(score)) {
            System.out.println("Điểm hợp lệ");
        } else {
            System.out.println("Điểm KHÔNG hợp lệ");
        }
    }
}
