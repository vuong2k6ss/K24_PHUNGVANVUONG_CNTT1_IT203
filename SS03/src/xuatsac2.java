public class xuatsac2 {
    //gộp 2 mảng
    public static int[] mergeBooks(int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[a.length + b.length];

        while (i < a.length && j < b.length) {
            int value;
            if(a[i] < b[j]) {
                value = a[i++];
            }else if (a[i] > b[j]) {
                value = b[j++];
            }else { // a[i] == b[j]
                value = a[i];
                i++;
                j++;
            }

            // Chỉ thêm nếu chưa trùng phần tử trước đó
            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }

        // Phần còn lại của mảng a
        while (i < a.length) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        //phần còn lại của mảng b
        while (j < b.length) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        //tạo mảng kết quả đúng kích thước
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }

    public static void display(int[] arr) {
        System.out.print("[ ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cu: ");
        display(arrayFirst);

        System.out.print("Lo moi: ");
        display(arraySecond);

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);

        System.out.print("Kho tong (da gop & loc trung): ");
        display(arrayMerge);
    }
}
