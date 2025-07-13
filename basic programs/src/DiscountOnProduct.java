import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double productAmount = sc.nextDouble();

        double discountedPrice = 0;
        if(productAmount >= 200){
            double deduction = (10*productAmount)/100;
            discountedPrice = productAmount - deduction;
            System.out.println("Final amount after discount is " + discountedPrice);
        }
        else if (productAmount >= 500) {
            double deduction = 15*productAmount/100;
            discountedPrice = productAmount - deduction;
            System.out.println("Final amount after discount is " + discountedPrice);
        }
        else if (productAmount >= 1000) {
            double deduction = 20*productAmount/100;
            discountedPrice = productAmount - deduction;
            System.out.println("Final amount after discount is " + discountedPrice);
        }
        else if (productAmount >= 2000) {
            double deduction = 30*productAmount/100;
            discountedPrice = productAmount - deduction;
            System.out.println("Final amount after discount is " + discountedPrice);
        }
        else{
            System.out.println("Final amount is " + productAmount);
        }
    }
}
