import java.util.Scanner;
public class averageOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int avg = average(arr,n);
        System.out.println("Average = " + avg);
    }
    public static int average(int arr[], int n){
        int sum = 0;
        int i = 0;
        while(i < arr.length){
            sum = sum + arr[i];
            i++;
        }
        int avg = sum/n;
        return avg;
    }
}
