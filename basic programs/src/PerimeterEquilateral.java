import java.util.Scanner;

public class PerimeterEquilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side --> ");
        double side = sc.nextDouble();

        double perimeter = 3*side;

        System.out.println("Perimeter of equilateral triangle is --> " + perimeter);
    }
}
