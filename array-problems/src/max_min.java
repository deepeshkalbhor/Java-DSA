import java.util.Scanner;
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = max(arr);
        System.out.println("Max = " + max);
        int min = min(arr);
        System.out.println("Min = " + min);
    }
    public static int max(int arr[]){
        int max = 0;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    public static int min(int arr[]){
        int min = arr[0];
        int i = 0;
        while(i < arr.length){
            if(arr[i] < min){
                min = arr[i];
            }
            i++;
        }
        return min;
    }
}
