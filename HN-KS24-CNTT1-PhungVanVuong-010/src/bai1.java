import java.util.*;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số lượng Sinh viên: ");
        int n = sc.nextInt();
        if (n<=0) {
            System.out.println("số lượng điểm");
        }
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("nhập điểm cho sinh viên thứ " + (i+1)+ ": ");
            double b = sc.nextDouble();
            list.add(b);
        }
        System.out.println();
        //điểm lơn nhất
        double maxScore = 0;
        for (Double i : list){
            if(i > maxScore){
                maxScore = i;
            }
        }
        System.out.println("điểm cao nhất: "+ maxScore);
        System.out.println();

        //xắp xếp điểm
        System.out.println("danh sách điểm tăng dần: ");
        Collections.sort(list);
        for (Double b : list) {
            System.out.print(b+ "  ");
        }
        System.out.println();
        System.out.println();

        //điểm trung bình
        double max = 0;
        for (Double i : list){
            max += i;
        }
        double DTB = max/ list.size();
        System.out.println("điểm trung bình: "+ DTB);

        //thống kê
        int soSVdau=0;
        int soSVrot=0;
        for (Double i : list){
            if(i>=5){
                soSVdau++;
            }else soSVrot++;
        }
        System.out.print("thống kê: ");
        System.out.print("đậu: "+soSVdau);
        System.out.print("  rớt: "+soSVrot);

    }
}