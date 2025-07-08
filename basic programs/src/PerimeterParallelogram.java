import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of base of parallelogram --> ");
        double base = sc.nextDouble();
        System.out.println("Enter the length of side of parallelogram --> ");
        double side = sc.nextDouble();

        double perimeter = 2*(base+side);

        System.out.println("Perimeter of the parallelogram is --> " + perimeter);
    }
}
