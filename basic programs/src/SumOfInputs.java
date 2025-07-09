import java.util.Scanner;
public class SumOfInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input --> ");
        int input = sc.nextInt();

        int sum = 0;

        while(input!=0){
            sum = sum + input;
            input = sc.nextInt();
        }
        System.out.println("The sum is --> " + sum);
    }
}
