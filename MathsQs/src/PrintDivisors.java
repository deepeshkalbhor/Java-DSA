public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
        int[] arr;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                for(int j = 1; j <= n; j++){
                    arr[j] = i;
                }
            }
        }
    }
}
