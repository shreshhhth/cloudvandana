import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));

        // Shuffle the ArrayList
        Collections.shuffle(arrayList);

        // Print the shuffled array
        System.out.println("Shuffled Array: " + arrayList);
    }
}
