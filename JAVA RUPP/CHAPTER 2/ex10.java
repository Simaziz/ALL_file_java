import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Analyze the sentence
        int wordCount = countWords(sentence);
        int consonantCount = countConsonants(sentence);
        int vowelCount = countVowels(sentence);
        int digitCount = countDigits(sentence);
        int specialCharCount = countSpecialCharacters(sentence);

        // Display the results
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Number of special characters: " + specialCharCount);
    }

    private static int countWords(String sentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split("\\s+");
        return words.length;
    }

    private static int countConsonants(String sentence) {
        // Remove non-alphabetic characters and count the remaining characters
        String consonantsOnly = sentence.replaceAll("[^a-zA-Z]", "");
        return consonantsOnly.length();
    }

    private static int countVowels(String sentence) {
        // Remove non-alphabetic characters and count the vowels
        String vowelsOnly = sentence.replaceAll("[^aeiouAEIOU]", "");
        return vowelsOnly.length();
    }

    private static int countDigits(String sentence) {
        // Remove non-digit characters and count the digits
        String digitsOnly = sentence.replaceAll("\\D", "");
        return digitsOnly.length();
    }

    private static int countSpecialCharacters(String sentence) {
        // Count characters that are neither alphabets nor digits
        String specialCharsOnly = sentence.replaceAll("[a-zA-Z0-9]", "");
        return specialCharsOnly.length();
    }
}
