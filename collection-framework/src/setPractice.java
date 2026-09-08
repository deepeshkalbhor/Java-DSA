import java.util.HashSet;
import java.util.Set;

public class setPractice {
    public static void main(String[] args) {

        Set<String> tasks = new HashSet<>();

        tasks.add("Login");
        tasks.add("Dashboard");
        tasks.add("Reports");
        tasks.add("Login");
        tasks.add("Dashboard");

        System.out.println(tasks);

        System.out.println(tasks.contains("Reports"));

        System.out.println(tasks.contains("Notifications"));

        tasks.remove("Dashboard");

        System.out.println(tasks);

    }
}
