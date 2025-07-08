import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side of the Square --> ");
        double side = sc.nextDouble();

        double perimeter = 4*side;

        System.out.println("Perimeter of the square is --> " + perimeter);
    }
}
