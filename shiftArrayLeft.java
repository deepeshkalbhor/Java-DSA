import java.util.Scanner;

public class shiftArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        shifting(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void shifting(int arr[], int n){
        int i = 0;
        int j = 1;
        while(i < n && j < n){
            arr[i] = arr[j];
            i++;
            j++;
        }
    }

}
