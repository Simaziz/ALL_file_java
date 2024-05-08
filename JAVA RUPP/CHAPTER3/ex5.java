import java.util.HashMap;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 10 integers between 1 and 100 separated by spaces:");

        // Read input line and split into tokens
        String inputLine = scanner.nextLine();
        String[] tokens = inputLine.split(" ");

        // Create a HashMap to store counts of each integer
        HashMap<Integer, Integer> counts = new HashMap<>();

        // Iterate over each token
        for (String token : tokens) {
            // Parse token into an integer
            int num = Integer.parseInt(token);

            // Increment count in HashMap
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Print counts
        System.out.println("Occurrences of each integer:");
        for (int key : counts.keySet()) {
            System.out.println(key + ": " + counts.get(key));
        }

        scanner.close();
    }
}
