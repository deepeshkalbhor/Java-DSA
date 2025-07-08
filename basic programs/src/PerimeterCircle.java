import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle --> ");
        double radius = sc.nextDouble();

        double pi = 3.14;

        double perimeter = 2*pi*radius;

        System.out.println("Circumference of circle is --> " + perimeter);
    }
}
