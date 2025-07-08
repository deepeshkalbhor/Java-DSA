import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side of the rhombus --> ");
        double side = sc.nextDouble();

        double perimeter = 4*side;

        System.out.println("Perimeter of the rhombus is --> " + perimeter);
    }
}
