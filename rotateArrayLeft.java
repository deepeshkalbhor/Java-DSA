import java.util.Scanner;

public class rotateArrayLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        rotation(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void rotation(int arr[], int n){
        int i = 0;
        int j = 1;
        int temp = arr[i];
        while(i < n && j < n){
            arr[i] = arr[j];
            i++;
            j++;
        }
        arr[n-1] = temp;
    }
}
