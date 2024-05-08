public class ex1 {

    public static boolean isSorted(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 2, 8, 3, 1};

        System.out.println("Array 1 is sorted: " + isSorted(array1));
        System.out.println("Array 2 is sorted: " + isSorted(array2));
    }
}
