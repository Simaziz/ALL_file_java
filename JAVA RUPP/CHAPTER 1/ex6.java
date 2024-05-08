import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        int totalCount = 0;
        int sum = 0;
        
        System.out.println("Enter integers (enter 0 to end):");
        
        while (true) {
            int num = input.nextInt();
            
            if (num == 0) {
                break;
            } else if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
            
            if (num != 0) {
                sum += num;
                totalCount++;
            }
        }
        
        if (totalCount > 0) {
            double average = (double) sum / totalCount;
            System.out.println("Total number of positive integers: " + positiveCount);
            System.out.println("Total number of negative integers: " + negativeCount);
            System.out.println("Total: " + sum);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No valid integers entered.");
        }
        
        input .close();
    }
}

