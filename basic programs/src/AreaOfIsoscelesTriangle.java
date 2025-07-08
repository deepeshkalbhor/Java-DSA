import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of equal sides (a): ");
        double a = sc.nextDouble();
        System.out.print("Enter length of base (b): ");
        double b = sc.nextDouble();

        if (b >= 2 * a) {
            System.out.println("Invalid triangle: base is too large.");
            return;
        }

        double area = (b / 4) * Math.sqrt(4 * a * a - b * b);

        System.out.println("Area of the isosceles triangle is: " + area);
    }
}
