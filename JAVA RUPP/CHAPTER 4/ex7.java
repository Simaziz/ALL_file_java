import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 2D array to store scores
        int[][] scores = new int[4][3];
        String[] subject={"math","chemictry","physic"};
        // Ask the user to input scores for each student and each subject
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter scores for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter score for Subject "+ subject[j] + ":");
                // System.out.print("Enter score for Subject physic"+ (i + 1) + ":");
                // System.out.print("Enter score for Subject chemistry"+ (i + 1) + ":");
                scores[i][j] = scanner.nextInt();
            }
        }

        // Calculate total score for each student and overall total score
        int[] studentTotal = new int[4];
        int totalScore = 0;
        for (int i = 0; i < 4; i++) {
            int studentSum = 0;
            for (int j = 0; j < 3; j++) {
                studentSum += scores[i][j];
            }
            studentTotal[i] = studentSum;
            totalScore += studentSum;
        }

        // Display the result in tabular format
        System.out.println("-------------------------------------------------------------");
        System.out.println("   Name  \t\tMath \tPhysics\tChemistry\tTotal");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.println("Student " + (i + 1) + "\t\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t\t" + studentTotal[i]);
        }
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%55d%n "+"Total Score:", + totalScore);

        scanner.close();
    }
}
