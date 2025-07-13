import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input for factorial --> ");
        int num = sc.nextInt();

        int fact = 1;
        int mul = 1;

        while(mul <= 5){
          fact = fact * mul;
          mul++;
        }
        System.out.println(fact);
    }
}
