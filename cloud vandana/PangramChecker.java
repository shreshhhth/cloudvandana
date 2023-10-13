import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence to check for pangram: ");
        String inputSentence = scanner.nextLine();

        // Check if it is a pangram
        boolean isPangram = checkPangram(inputSentence.toLowerCase());
        System.out.println("Is Pangram: " + isPangram);
    }

    private static boolean checkPangram(String sentence) {
        // Set to store unique characters
        Set<Character> uniqueCharacters = new HashSet<>();

        // Iterate through each character in the sentence
        for (char c : sentence.toCharArray()) {
            // Add alphabets to the set
            if (Character.isAlphabetic(c)) {
                uniqueCharacters.add(c);
            }
        }

        // Check if all alphabets are present
        return uniqueCharacters.size() == 26;
    }
}

