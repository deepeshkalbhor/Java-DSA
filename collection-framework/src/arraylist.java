import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> food = new ArrayList<>();

        System.out.print("Enter the number of food items: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numOfFood; i++){
            System.out.println("Add food " + i + " item");
            String foodItem = sc.nextLine();
            food.add(foodItem);
        }

        System.out.println(food);

        sc.close();
    }
}
