import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length --> ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth --> ");
        double breadth = sc.nextDouble();

        double perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangle is --> " + perimeter);
    }
}
