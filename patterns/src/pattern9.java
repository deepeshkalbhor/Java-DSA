public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int k = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print(j);
            }
            k--;
            System.out.println();
        }
    }
}
