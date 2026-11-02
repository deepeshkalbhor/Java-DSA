import java.util.Scanner;

public class LVL1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = sc.nextInt();

        if(temp <= 20){
            System.out.println("Cold");
        } else if (temp > 20 && temp <= 40) {
            System.out.println("Warm");
        }
        else {
            System.out.println("Hot");
        }
    }
}
