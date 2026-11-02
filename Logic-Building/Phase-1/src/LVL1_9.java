import java.util.Scanner;

public class LVL1_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char ch = sc.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if(ch >= 'a' && ch <= 'z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println("Invalid input. Please enter the correct alphabet");
        }
    }
}
