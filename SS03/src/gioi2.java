import java.util.Random;
public class gioi2 {
    //Bubble Sort
    public static void sortBooks(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //hiển thị mảng
    public static void displayBooks(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] books = new int[5];
        for (int i = 0; i < books.length; i++) {
            books[i] = 100 + r.nextInt(10); // 100 -> 109
        }
        System.out.print("Truoc khi sap xep: ");
        displayBooks(books);

        sortBooks(books);

        System.out.print("Sau khi sap xep: ");
        displayBooks(books);
    }
}
