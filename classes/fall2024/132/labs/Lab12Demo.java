import java.util.Arrays;

public class Lab12Demo {

    public static void main(String[] args) {
        System.out.println("Dictionary Word Search");
        String[] dictionary = {"Abstruse", "Benevolent", "Cacophony", "Conundrum", "Cynical", "Dichotomy", "Elucidate", "Facetious", "Ineffable", "Juxtaposition", "Mellifluous", "Obfuscate", "Serendipity", "Tenacious", "Ubiquitous"};
        String word;
        int index;

        System.out.println(Arrays.toString(dictionary));
        System.out.println("----------------------------------------------------------------");

        word = "Conundrum";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);

        word = "Ubiquitous";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);

        word = "Juxtaposition";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);

        word = "Paradigm";
        index = binary_search(dictionary, word);
        System.out.println("\"" + word + "\" is located at index: " + index);
    }

    private static int binary_search(String[] dictionary, String target) {
    	//TO DO: Write the algorithm for Binary Search here
    }

}
