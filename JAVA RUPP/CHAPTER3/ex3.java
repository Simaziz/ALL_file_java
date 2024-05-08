import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);

        // Variables to store the youngest person's name and age
        String youngestName = "";
        int youngestAge = Integer.MAX_VALUE; // Initialize to a very large value
     
        // Loop to get the name and age of three people
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter name and age of person " + i + ": ");
            String input = Input.nextLine();
            String[] parts = input.split(" "); // Split the input into name and age

            // Extract name and age from the input
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            // Update youngest person's name and age if applicable
            if (age < youngestAge) {
                youngestName = name;
                youngestAge = age;
            }
        }

        // Display the name of the youngest person
        System.out.println("The name of the youngest person is " + youngestName);

        Input.close();
    }
    
}
