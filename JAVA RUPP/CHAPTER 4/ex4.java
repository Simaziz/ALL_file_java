import java.util.Arrays;

public class ex4 {

    // Method to check if a 2D array is a subset of another 2D array
    public static boolean isSubset(int[][] subset, int[][] array) {
        // Iterate over each sub-array in the subset
        for (int[] subArray : subset) {
            // Check if the current sub-array exists in the array
            if (!contains(subArray, array)) {
                return false; // If not found, subset is not a subset of array
            }
        }
        return true; // If all sub-arrays are found, subset is a subset of array
    }

    // Helper method to check if a 1D array exists in a 2D array
    private static boolean contains(int[] subArray, int[][] array) {
        // Iterate over each sub-array in the arrayr
         
        for (int[] arr : array) {
            // Check if the current sub-array matches the given subArray
            if (Arrays.equals(subArray, arr)) {
                return true; // If found, return true
            }
        }
        return false; // If not found, return false
    }

    // Main method to test the isSubset function
    public static void main(String[] args) {
        // Define the arrays to be tested
        int[][] array1 = {{1, 3}, {5, 7}, {9, 11}, {13, 15, 17}};
        int[][] subset1 = {{1, 3}, {13, 15, 17}};
        int[][] subset2 = {{5, 7}, {9, 11}};

        // Test and print whether subset1 is a subset of array1
        System.out.println("Is subset1 a subset of array1? " + isSubset(subset1, array1));
        // Test and print whether subset2 is a subset of array1
        System.out.println("Is subset2 a subset of array1? " + isSubset(subset2, array1));
    }
}
