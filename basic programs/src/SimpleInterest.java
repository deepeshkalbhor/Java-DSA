import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter rate: ");
        float rate = sc.nextFloat();
        System.out.println("Enter time: ");
        int time = sc.nextInt();

        double SI = principal * rate * time / 100;

        System.out.println("Simple Interest is: " + SI);
    }
}
