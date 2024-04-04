package HashMap.adv;

import java.util.HashMap;

import java.util.HashMap;

public class AlphabetCounter {
    public static void main(String[] args) {
        String input = "Pprafful";
        HashMap<Character, Integer> alphabetCount = new HashMap<>();

        // Convert the input string to lowercase for case-insensitive counting
        input = input.toLowerCase();

        // Iterate through each character in the input string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                // Update the count in the HashMap
                alphabetCount.put(ch, alphabetCount.getOrDefault(ch, 0) + 1);
            }
        }

        // Print the alphabet counts
        for (char ch : alphabetCount.keySet()) {
            System.out.println(ch + "-" + alphabetCount.get(ch));
        }
    }
}



