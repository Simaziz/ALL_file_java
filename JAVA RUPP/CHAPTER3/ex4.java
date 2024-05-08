import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        // Create a object of Scanner
        Scanner scanner = new Scanner(System.in);
        //User enter five scores separated by a space in one line
        System.out.print("Enter scores: ");
        String input = scanner.nextLine();
        // This line splits the input string into an array 
        String[] scoresStr = input.split(" ");
        // use loop for output five Score 
        for (String scoreStr : scoresStr) {
            // Convert converts each score from a string to an integer 
            int score = Integer.parseInt(scoreStr);
             
            // Use condition statement to determine score

            // The grade is A if score is >= 90.
            if (score >= 90) {
                System.out.println("Score is " + score + " and Grade is A");
            } 
            //The grade is B if 90 > score >= 80.
            else if (score >= 80) {
                System.out.println("Score is " + score + " and Grade is B");
            } 
            // The grade is C if 80 > score >= 70.
            else if (score >= 70) {
                System.out.println("Score is " + score + " and Grade is C");
            }
            //The grade is D if 70 > score >= 60.
             else if (score >= 60) {
                System.out.println("Score is " + score + " and Grade is D");
            }
            //The grade is E if 60 > score >= 50.
             else if (score >= 50) {
                System.out.println("Score is " + score + " and Grade is E");
            // The grade is F otherwise.
            } else {
                System.out.println("Score is " + score + " and Grade is F");
            }
        }
        // close Scanner
        scanner.close();
    }
}