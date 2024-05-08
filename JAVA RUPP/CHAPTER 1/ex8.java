public class ex8 {
    public static void main(String[] args) {
        // declare variable
        double sum = 0.0;

        // Iterate through the numerators from 1 to 97, incrementing by 2
        for (double numerator = 1.0; numerator <= 97.0; numerator += 2) {
            // Calculate the denominator as numerator + 2
            double denominator = numerator + 2;

            // Add the fraction to the sum
            sum += numerator / denominator;
        }

        // Print the final sum
        System.out.println("The sum of the series is : " + sum);
    }
}
