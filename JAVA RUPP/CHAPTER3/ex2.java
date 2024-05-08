import java.util.HashSet;
import java.util.Set;

public class ex2 {

    public static String[] findIntersection(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> intersection = new HashSet<>();

        // Add elements from array1 to set1
        for (String s : array1) {
            set1.add(s);
        }

        // Add elements from array2 to set2
        for (String s : array2) {
            set2.add(s);
        }

        // Find the intersection of set1 and set2
        for (String s : set1) {
            if (set2.contains(s)) {
                intersection.add(s);
            }
        }

        // Convert the intersection set to an array
        String[] result = new String[intersection.size()];
        intersection.toArray(result);

        return result;
    }

    public static void main(String[] args) {
        String[] array1 = {"apple", "orange", "banana", "kiwi"};
        String[] array2 = {"banana", "kiwi", "grape", "pear"};

        String[] intersection = findIntersection(array1, array2);

        System.out.println("Intersection of the arrays: ");
        for (String s : intersection) {
            System.out.println(s + " ");
        }
    }
}
