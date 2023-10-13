import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Roman numeral
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine();

        // Convert to integer
        int result = romanToInteger(romanNumeral.toUpperCase());
        System.out.println("Converted to Integer: " + result);
    }

    private static int romanToInteger(String roman) {
        Map<Character, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int currentNumeral = romanNumerals.get(roman.charAt(i));
            int nextNumeral = (i + 1 < roman.length()) ? romanNumerals.get(roman.charAt(i + 1)) : 0;

            if (nextNumeral > currentNumeral) {
                result += (nextNumeral - currentNumeral);
                i++; // Skip the next numeral
            } else {
                result += currentNumeral;
            }
        }

        return result;
    }
}

