public class pattern10 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i < n; i++){
            for(int j = n - 2; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (i*2-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
