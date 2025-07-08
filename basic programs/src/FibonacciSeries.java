import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int fib = 0;

        System.out.print(a + " " + b);

        for(int i = 2; i < n; i++){
            fib = a + b;
            System.out.print(" " + fib);
            a = b;
            b = fib;
        }
    }
}
