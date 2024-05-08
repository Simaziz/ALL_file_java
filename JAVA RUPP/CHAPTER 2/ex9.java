import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a value
        System.out.print("Enter a value: ");
        String input = scanner.nextLine();

        // Convert the input to uppercase to ignore case
        String upperCaseInput = input.toUpperCase();

        // Check if the input is a valid hexadecimal number
        if (isHexadecimal(upperCaseInput)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Close the Scanner to avoid resource leak
        scanner.close();
    }

    // Function to check if a string is a valid hexadecimal number
    private static boolean isHexadecimal(String input) {
        // The regular expression to match a hexadecimal number
        String hexPattern = "^[0-9A-F]+$";
        return input.matches(hexPattern);
    }
}
