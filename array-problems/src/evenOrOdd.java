import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int even = even(arr);
        System.out.println("Even numbers = " + even);

        int odd = odd(arr);
        System.out.println("Odd numbers = " + odd);

    }
    public static int even(int arr[]){
        int even = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }
        }

        return even;
    }
    public static int odd(int arr[]) {

        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }
}
