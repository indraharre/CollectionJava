import java.lang.annotation.ElementType;
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Set Interface
        Set<ElementType> setName = new HashSet<>();

        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Duplicate entry, will not be added

        uniqueNames.remove("Bob");

        // LinkedHashSet Implementatie
        Set<String> orderedNames = new LinkedHashSet<>();

        orderedNames.add("Zara");
        orderedNames.add("John");
        orderedNames.add("Alice");

        for (String name : orderedNames) {
            System.out.println(name);
        }

        // TreeSet Implementatie
        Set<Integer> sortedNumbers = new TreeSet<>();

        sortedNumbers.add(3);
        sortedNumbers.add(1);
        sortedNumbers.add(2);

        for (int num : sortedNumbers) {
            System.out.println(num);

            // Set Operations
            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();

            Set<String> union = new HashSet<>(set1);
            union.addAll(set2);

            Set<String> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);

            Set<String> difference = new HashSet<>(set1);
            difference.removeAll(set2);
        }
    }
}
