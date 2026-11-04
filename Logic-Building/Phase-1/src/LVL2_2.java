import java.util.Scanner;

public class LVL2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current hour: ");
        int hour = sc.nextInt();

        if(hour > 5 && hour <= 11){
            System.out.println("Good Morning");
        }
        else if(hour > 11 && hour <= 16){
            System.out.println("Good Afternoon");
        } else if (hour > 16 && hour <= 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }
    }
}
