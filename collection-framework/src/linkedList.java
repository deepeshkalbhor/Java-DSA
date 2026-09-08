import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Login");
        tasks.add("Dashboard");
        tasks.add("Reports");
        tasks.add("Notifications");

        System.out.println(tasks);

        tasks.addFirst("Authentication");

        System.out.println(tasks);

        tasks.addLast("Testing");

        System.out.println(tasks);

        tasks.remove("Dashboard");

        System.out.println(tasks);

        tasks.removeFirst();

        System.out.println(tasks);

        System.out.println("First: " + tasks.getFirst());

        System.out.println("Last: " + tasks.getLast());
    }
}
