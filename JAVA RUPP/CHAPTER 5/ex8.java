import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("#.##");
        int score = 0;
        String[] questions = new String[5];
        String[] answers = new String[5];

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(11) + 10; // Generating numbers between 10 and 20
            int num2 = random.nextInt(11) + 10;
            char operator = generateOperator(random);

            questions[i] = "Question " + (i + 1) + ": What is " + num1 + " " + operator + " " + num2 + "? ";
            double userAnswer = Double.parseDouble(input.nextLine());

            double correctAnswer = calculateAnswer(num1, num2, operator);
            answers[i] = df.format(correctAnswer);

            if (Math.abs(userAnswer - correctAnswer) < 0.01) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("\nYou got " + score + " correct answers out of 5 .");

        System.out.println("The details are below:");
        for (int i = 0; i < 5; i++) {
            System.out.println(questions[i] + answers[i] + (answers[i].equals("Correct") ? "" : " Incorrect. The correct answer is " + answers[i]));
        }
    }

    private static char generateOperator(Random random) {
        int op = random.nextInt(4);
        switch (op) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '*';
            case 3:
                return '/';
            default:
                return '+'; // Default to addition
        }
    }

    private static double calculateAnswer(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return (double) num1 / num2;
            default:
                return 0; // Should not happen
        }
    }
}
