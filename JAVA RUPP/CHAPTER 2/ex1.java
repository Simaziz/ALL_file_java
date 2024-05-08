public class ex1 {
    public static String convertToNextAlphabet(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (Character.isLowerCase(currentChar)) {
                    result.append((char) ((currentChar - 'a' + 1) % 26 + 'a'));
                } else if (Character.isUpperCase(currentChar)) {
                    result.append((char) ((currentChar - 'A' + 1) % 26 + 'A'));
                }
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "Hello";
        String outputString = convertToNextAlphabet(inputString);
        System.out.println(outputString);
    }
}
