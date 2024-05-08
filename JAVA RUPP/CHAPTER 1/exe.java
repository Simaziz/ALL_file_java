import java.util.Scanner;

public class exe {
    public static void main(String[] args) {
        int total = 0;
        //create new object of scanner
        Scanner scanner = new Scanner(System.in);
        // while loop
        while (total <= 50) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

           total += number;
            System.out.println("The total is " + total);
        }

        System.out.println("The total is over 50. Exiting the loop.");
        
        scanner.close();
    }
}
