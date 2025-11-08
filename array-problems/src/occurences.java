import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int count = 0;
        int occurenceCount = count(arr, target, count);
        System.out.println(occurenceCount);
    }
    public static int count(int arr[], int target, int count){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
