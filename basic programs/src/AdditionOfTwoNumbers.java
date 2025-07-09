import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input 1 --> ");
        int num1 = sc.nextInt();
        System.out.println("Enter input 2 --> ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of inputs is --> " + sum);
    }
}
