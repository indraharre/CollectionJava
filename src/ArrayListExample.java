import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Alice");
        arrayList.add("Bob");
        arrayList.add("Charlie");

        String firstPerson = arrayList.get(0);
        System.out.println("First Person: " + firstPerson);

        arrayList.set(1, "Updated Bob");

        arrayList.remove("Charlie");
        // OR
        // arrayList.remove(1);

        System.out.println("Using Enhanced For Loop:");
        for (String name : arrayList) {
            System.out.println(name);
        }

        System.out.println("Using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}