public class pattern11 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = n - n+1; j < i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*n-i-i+1; k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
