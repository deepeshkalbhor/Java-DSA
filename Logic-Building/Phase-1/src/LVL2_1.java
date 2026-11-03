import java.util.Scanner;

public class LVL2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are allowed to vote!");
        }
        else{
            System.out.println("Sorry! You are not allowed to vote.");
        }

        sc.close();
    }
}
