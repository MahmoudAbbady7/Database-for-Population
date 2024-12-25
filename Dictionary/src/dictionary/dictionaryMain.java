package dictionary;

import WorldCollection.WordCollection;

public class dictionaryMain extends WordCollection {
public static void main(String[] args) {

   //b3emel el object
    WordCollection wordCollection = new WordCollection();

    //ba  Adding words to the collection
    wordCollection.addWord("Abbady");
    wordCollection.addWord("Ahmed");
    wordCollection.addWord("Bravoooo");
    wordCollection.addWord("Ball");
    wordCollection.addWord("Captain");
    wordCollection.addWord("Dog");
    wordCollection.addWord("Eslam");
    wordCollection.addWord("Anttmaaaamm");

    // Print all words
    System.out.println("All words in the collection:");
    wordCollection.printAllWords();

    // Print words for a specific letter
    System.out.println("\nWords starting with 'A':");
    wordCollection.printWordsByLetter('A');

    System.out.println("\nWords starting with 'B':");
    wordCollection.printWordsByLetter('B');

    System.out.println("\nWords starting with 'C':");
    wordCollection.printWordsByLetter('C');

    System.out.println("\nWords starting with 'Z':");
    wordCollection.printWordsByLetter('Z');
}
}
