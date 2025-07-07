import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the operator: ");
        char operator = sc.next().charAt(0);

        if(operator == '+'){
            System.out.println("Addition operation --> Ans: " + num1 + num2);
        }
        else if(operator == '-'){
            System.out.println("Subtraction operation --> Ans: " + (num1-num2));
        }
        else if(operator == '*'){
            System.out.println("Multiplication operation --> Ans: " + num1*num2);
        }
        else{
            System.out.println("Division operation --> Ans: " + num1/num2);
        }
    }
}
