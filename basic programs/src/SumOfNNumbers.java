import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of inputs : ");
        int noOfInputs = sc.nextInt();

        int a = 1;
        double sum = 0;

        while(a <= noOfInputs){
            System.out.println("Enter the input " + a + " : ");
            double inputValue = sc.nextDouble();
            sum = sum + inputValue;
            a++;
        }
        System.out.println("The sum of numbers is--> " + sum);
    }
}
