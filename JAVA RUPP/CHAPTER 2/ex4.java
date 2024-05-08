import java.util.Scanner;
public class ex4{

    public static void main(String[] args) {
        // Create a new Scanner
        Scanner scanner = new Scanner(System.in);
       
        // Ask the user to enter a word
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();

        // Check if the entered word is a palindrome
        boolean isPalindrome = checkPalindrome(inputWord);

        // Display the result
        if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
        scanner.close();
    }

    private static boolean checkPalindrome(String word) {
        // Remove spaces and convert to lowercase for a case-insensitive comparison
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        // Compare the original and reversed strings
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

        return cleanedWord.equals(reversedWord);
    }

}
