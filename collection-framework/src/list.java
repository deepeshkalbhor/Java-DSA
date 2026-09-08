import java.util.ArrayList;

public class list {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Aayush");
        names.add("Deepesh");
        names.add("Nachiket");
        names.add("Prajwal");

        System.out.println(names);

        System.out.println(names.get(2));

        System.out.println(names.size());

        System.out.println(names.remove(3));

        System.out.println(names);
    }
}
