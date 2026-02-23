import java.util.Scanner;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class kha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);

        System.out.println("\nKẾT QUẢ");
        System.out.printf("Hình tròn - Diện tích: %.2f\n", circle.getArea());
        System.out.printf("Hình tròn - Chu vi: %.2f\n", circle.getPerimeter());

        System.out.printf("Hình chữ nhật - Diện tích: %.2f\n", rectangle.getArea());
        System.out.printf("Hình chữ nhật - Chu vi: %.2f\n", rectangle.getPerimeter());
    }
}