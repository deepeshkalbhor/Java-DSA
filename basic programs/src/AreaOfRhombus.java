import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first length --> ");
        double d1 = sc.nextDouble();
        System.out.println("Enter the length of second diagonal --> ");
        double d2 = sc.nextDouble();

        double area = d1*d2/2;
        System.out.println("Area of rhombus is --> " + area);
    }
}
