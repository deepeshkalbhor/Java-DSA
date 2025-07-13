import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int noOfSubjects = sc.nextInt();

        int a = 1;
        double sum = 0;

        while(a <= noOfSubjects){
            System.out.println("Enter the subject " + a + " marks : ");
            double marks = sc.nextDouble();
            sum = sum + marks;
            a++;
        }
        double average = sum / noOfSubjects;
        System.out.println("The average of marks is--> " + average);
    }
}
