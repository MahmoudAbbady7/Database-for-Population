package WorldCollection;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class WordCollection {
    
    //Ba3mel var esmoh wordMab
    private Map<Character, List<String>> wordsMap;

    public WordCollection() {
        wordsMap = new HashMap<>();
        // Initialize the map with letters A-Z
        for (char c = 'A'; c <= 'Z'; c++) {
            wordsMap.put(c, new ArrayList<>());
        }
    }

    // Method to add a word to the collection
    public void addWord(String word) {
        if (word != null && !word.isEmpty()) {
            char firstChar = Character.toUpperCase(word.charAt(0));
            if (wordsMap.containsKey(firstChar)) {
                wordsMap.get(firstChar).add(word);
                // Sort the list after adding a new word
                Collections.sort(wordsMap.get(firstChar));
            }
        }
    }

    // Method to print all letters and corresponding words
    public void printAllWords() {
        for (Map.Entry<Character, List<String>> entry : wordsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to print words of a given letter
    public void printWordsByLetter(char letter) {
        letter = Character.toUpperCase(letter);
        if (wordsMap.containsKey(letter)) {
            System.out.println(letter + ": " + wordsMap.get(letter));
        } else {
            System.out.println("No words found for the letter: " + letter);
        }
    }}