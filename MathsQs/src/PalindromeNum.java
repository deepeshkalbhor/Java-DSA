public class PalindromeNum {
    public static void main(String[] args) {
        int n = 121;
        int rev = 0;
        int a = 0;
        int original = n;

        while(n > 0){
            a = n % 10;
            rev = rev * 10 + a;

            n = n /10;
        }
        if(rev == original){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
