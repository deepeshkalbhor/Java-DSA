public class pattern6 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            int count = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(count);
                if(count == 1){
                    count = 0;
                }
                else{
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}
