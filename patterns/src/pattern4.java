public class pattern4{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++){
            int a = 1;
            for(int j = 1; j <= n; j++){
                System.out.print(a);
                a++;
            }
            a = 1;
            n--;
            System.out.println();
        }
    }
}
