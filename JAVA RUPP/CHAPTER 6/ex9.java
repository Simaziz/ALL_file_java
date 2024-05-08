import java.util.Scanner;

public class ex9 {

    public static void displayLeaders(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n - 1];
        System.out.println("Leaders: " + maxRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                System.out.println("Leaders: " + maxRight);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        // Ask the user to input array elements
        System.out.print("Enter the elements of the array separated by spaces:");
        String[] elements = scanner.nextLine().split(" ");
        int[] arr = new int[elements.length];
        
        // Convert string elements to integers
        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }
        
        // Display the leaders in the array
        displayLeaders(arr);

        scanner.close();
    }
}
