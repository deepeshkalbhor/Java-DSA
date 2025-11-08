
import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int indexNumber = index(arr, target);
        System.out.println(indexNumber);
    }
    public static int index(int arr[], int target){
        int index = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == target){
                index = i;
            }

        }
        return index;
    }
}
