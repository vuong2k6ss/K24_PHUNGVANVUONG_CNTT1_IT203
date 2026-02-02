class Students {
    String name;

    Students(String name) {
        this.name = name;
    }
}

public class kha2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;
        System.out.println("Biến nguyên thủy:");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20
        System.out.println();

        //biến tham chiếu object
        Students s1 = new Students("An");
        Students s2 = s1; // copy tham chiếu địa chỉ
        s2.name = "Bình";

        System.out.println("Biến tham chiếu:");
        System.out.println("s1.name = " + s1.name);
        System.out.println("s2.name = " + s2.name);
    }
}
