import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        float[] arr = new float[n];
//        System.out.println("nhập các phần tử của mảng: ");
//        for (int i = 0; i < n; i++) {
//            System.out.printf("phần tử thứ "+(i+1)+ ": ");
//            arr[i] = sc.nextFloat();
//        }

        Random r = new Random();
        for (int i = 0; i <n ; i++) {
            arr[i] = r.nextInt(10);
        }

        System.out.println("\nCac phan tu trong mang:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.0f\t", arr[i]);
            // Sau mỗi 15 phần tử thì xuống dòng
            if ((i + 1) % 15 == 0) {
                System.out.println();
            }
        }

//        for(float ele: arr){
//            System.out.printf(ele + "\t");
//        }

        // đếm số phần tử trùng và in


    }
}

