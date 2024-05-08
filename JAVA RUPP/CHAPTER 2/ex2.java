import java.util.Scanner;

public class ex2 {
    public static String insertSpaceBeforeCapital(String input) {
        StringBuilder result = new StringBuilder();
        
        // Add the first character without space
        result.append(input.charAt(0));

        // Iterate from the second character onward
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Insert a space before a capital letter
            if (Character.isUpperCase(currentChar)) {
                result.append(" ");
            }

            // Append the current character to the result
            result.append(currentChar);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a word
        System.out.print("Enter a word with uppercase and lowercase characters: ");
        String userInput = scanner.nextLine();

        // Call the method to insert spaces before capital letters
        String result = insertSpaceBeforeCapital(userInput);

        // Print the result
        System.out.println("Result: " + result);

        // Close the scanner
        scanner.close();
    }
}
