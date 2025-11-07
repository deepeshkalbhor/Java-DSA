import java.util.Scanner;
public class find_the_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Array's length should be greater than 0");
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sumOfAllElements(arr);
        System.out.println(sum);
    }

        public static int sumOfAllElements(int arr[])
    {
        int sum = 0;
        int i = 0;
        while(i < arr.length){
          sum = sum + arr[i];
          i++;
        }
        return sum;
    }

}

