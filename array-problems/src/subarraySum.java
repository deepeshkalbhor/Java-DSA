import java.util.Scanner;

public class subarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("First index: ");
        int firstIndex = sc.nextInt();
        System.out.println("Last index: ");
        int lastIndex = sc.nextInt();
        if(lastIndex > arr.length-1){
            System.out.println("last index should be smaller than the length of array");
        }
        int sumOfElements = sum(arr, firstIndex, lastIndex);
        System.out.println("Sum is: " + sumOfElements);
    }
    static int sum(int arr[], int firstIndex, int lastIndex){
        int i = firstIndex;
        int j = lastIndex;
        int sum = 0;
        for(int a = i; i <= j; i++){
            sum = sum + arr[a];
        }
        return sum;
    }

}
