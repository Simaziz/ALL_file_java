import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        // create a new object of Scanner
        Scanner Input = new Scanner(System.in);
        // total
        int total = 0;
        // do while loop
        do {
            System.out.print("Enter a number: ");
            int num = Input.nextInt();
            total += num;

            // ask to the user if want to input another number or not 

            System.out.print("Do you want to add another number? (y/n): ");
            String choice = Input.next();
            // if user input Y ,user can input another number if user input N,that is stoped 
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);
        // tell the user about total 

        System.out.println("The total sum is: " + total);
    }
}
