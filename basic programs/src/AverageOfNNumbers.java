import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of observations : ");
        int noOfObservations = sc.nextInt();

        int a = 1;
        double sum = 0;

        while(a <= noOfObservations){
            System.out.println("Enter the " + a + " observation :");
            double observation = sc.nextDouble();
            sum = sum + observation;
            a++;
        }
        double average = sum / noOfObservations;
        System.out.println("The average is --> " + average);
    }
}
