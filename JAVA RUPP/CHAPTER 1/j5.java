import java.util.Scanner;

public class j5 {
    public static void main(String[] args) {

        // declare variable
        int computerNum = 50;
        
            //create object of scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");

        while (true){
            //Input Guess
            System.out.print("Enter your guess: ");
            int userGuess = input.nextInt();

          //Condition statement
            if (userGuess < computerNum) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > computerNum) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Well done " );
                break;
            }
        }
        //close scanner object

        input.close();
    }
}