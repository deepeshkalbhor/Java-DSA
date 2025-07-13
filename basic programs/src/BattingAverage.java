import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of runs you have scored --> ");
        int runs = sc.nextInt();

        System.out.println("The number of innings you have played --> ");
        int innings = sc.nextInt();

        System.out.println("The number of times you have remained not out --> ");
        int notout = sc.nextInt();

        double batting_average = runs/(innings - notout);
        System.out.println("Your batting average is --> " + batting_average);
    }
}
