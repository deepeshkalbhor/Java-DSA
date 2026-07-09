public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int a = 0;
        int count = 0;
        int mul = 1;

        while(n > 0){
            count++;

            while (count > 0){
                for(int i = 1; i <= count; i++){
                    a = n % 10;
                    mul = mul * a;
                }
                count--;
            }

            n = n/10;

        }


        System.out.println(mul);

    }
}
