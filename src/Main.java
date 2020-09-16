import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red");
//        System.out.println(shape);

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập màu tam giác");
        String color = scanner.nextLine();
        System.out.println("nhập side1");
        double a = scanner.nextDouble() ;
        System.out.println("nhập side2");
        double b = scanner.nextDouble();
        System.out.println("nhập side3");
        double c = scanner.nextDouble();


        Triangle triangle = new Triangle(a,b,c,color);
        System.out.println(triangle);

    }
}
