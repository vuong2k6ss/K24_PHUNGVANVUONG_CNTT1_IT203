import java.util.Scanner;
public class kha2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i; //thấy
            }
        }
        return -1; // không thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {
                "Doraemon",
                "One Piece",
                "Conan",
                "Dragon Ball",
                "Naruto"
        };

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();

        int index = searchBooks(books, search);

        if(index != -1) {
            System.out.println("Tim thay sach '" + search + "' tai vi tri so: " + index);
        }else{
            System.out.println("Sach khong ton tai trong thu vien.");
        }
    }
}
