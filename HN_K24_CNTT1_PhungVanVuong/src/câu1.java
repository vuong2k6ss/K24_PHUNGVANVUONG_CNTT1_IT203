import java.util.Scanner;
import java.lang.String;
//câu 1.1
public class câu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập vào chuỗi viết thường: ");
        String str = sc.nextLine().toLowerCase();
        int count = 0;
        int flag = 0;
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = 1; j < str.length(); j++) {
                    if(str[i]==str[j]){
                        count++;
                    }else {
                        System.out.println(str);
                    }
                }
            }
    }
}