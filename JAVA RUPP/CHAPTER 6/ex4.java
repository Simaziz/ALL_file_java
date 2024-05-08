import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {
        String sentence = "Hello! This is a sample sentence, with special characters.";
        String[] words = split(sentence);
        
        for (String word : words) {
            System.out.println(word);
        }
    }  
    
    public static String[] split(String sentence) {
        ArrayList<String> wordsList = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(c);
            } else if (word.length() > 0) {
                wordsList.add(word.toString());
                word = new StringBuilder();
            }
        }
        
        if (word.length() > 0) {
            wordsList.add(word.toString());
        }
        
        return wordsList.toArray(new String[0]);
    }
}
