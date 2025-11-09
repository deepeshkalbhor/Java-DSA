import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        reversing(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void reversing(int arr[], int n){
        int i = 0;
        int j = n-1;
        int temp;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
