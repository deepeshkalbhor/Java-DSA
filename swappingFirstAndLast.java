import java.util.Scanner;

public class swappingFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        swapping(n, arr);

    }
    public static void swapping(int n, int arr[]){
        int i = 0;
        int j = n-1;
        System.out.println("Before swapping: " + arr[i] + " " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("After swapping: " + arr[i] + " " + arr[j]);
    }
}
