public class gioi1 {

    // tìm sách có số lượng lớn nhất
    public static void maxQuantityOfBooks(String[] names, int[] quantities) {
        int max = quantities[0];
        // Tìm gt lớn nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        //in tất cả sách có số lượng = max
        System.out.println("Sach co so luong nhieu nhat (" + max + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i]);
            }
        }
    }

    //tìm sách có số lượng nhỏ nhất
    public static void minQuantityOfBooks(String[] names, int[] quantities) {
        int min = quantities[0];

        // Tìm gtr nhỏ nhất
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        //in tất cả sách có số lượng = min
        System.out.println("Sach co so luong it nhat (" + min + "):");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] bookNames = {"Python", "Web", "Java", "Data Structure", "AI Fundamental"};
        int[] quantities = {50, 50, 30, 5, 30};

        maxQuantityOfBooks(bookNames, quantities);
        System.out.println("--------------------");
        minQuantityOfBooks(bookNames, quantities);
    }
}
