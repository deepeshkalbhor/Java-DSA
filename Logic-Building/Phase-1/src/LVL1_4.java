import java.util.Scanner;

public class LVL1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Number is divisible by both 3 and 5");
        }
        else{
            System.out.println("Sorry this number is not divisble by 3 and 5");
        }
    }
}
