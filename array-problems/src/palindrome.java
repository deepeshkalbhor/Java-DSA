import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        boolean palindrome = isPalindrome(arr);
        if(palindrome){
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }
    }
    public static boolean isPalindrome(int arr[]){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
