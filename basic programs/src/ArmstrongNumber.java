import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int r;
        int sum = 0;
        int temp = number;

        while(number > 0){
        r = number%10;
        number = number/10;
        sum = sum + r*r*r;
        }
        if(temp == sum){
            System.out.println("Its an armstrong number");
        }
        else{
            System.out.println("Sorry! But its not an armstrog number");
        }
    }
}
