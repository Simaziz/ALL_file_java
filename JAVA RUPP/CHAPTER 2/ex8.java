import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Check if the password is valid
        if (isValidPassword(password)) {
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password is invalid. Please follow the specified rules.");
        }

        scanner.close();
    }

    // Function to check the validity of a password based on rules
    private static boolean isValidPassword(String password) {
        // Rule 1: A password must have exactly 8 characters.
        if (password.length() != 8) {
            return false;
        }

        // Rule 2: A password must consist of only digits and letters.
        if (!password.matches("[a-zA-Z0-9]+")) {
            return false;
        }

        // Rule 3: A password must always start with a digit.
        if (!Character.isDigit(password.charAt(0))) {
            return false;
        }

        // Rule 4: A password must contain at least one uppercase letter.
        boolean containsUppercase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
                break;
            }
        }

        return containsUppercase;
    }
}
