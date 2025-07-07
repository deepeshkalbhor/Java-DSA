import java.util.Scanner;
public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount in rupees: ");
        double rupees = sc.nextDouble();

        double dollars = rupees * 0.012;
        System.out.println("After converting to dollars = " + dollars);
    }
}
