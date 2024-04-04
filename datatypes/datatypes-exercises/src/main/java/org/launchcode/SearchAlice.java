package org.launchcode;
import java.util.Scanner;
public class SearchAlice {
    public static void main(String[] args){
        String firstSentence = "Alice was beginning to get very tired " +
                "of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?' ";

        firstSentence = firstSentence.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search for in the sentence: ");
        String searchWord = input.next().toLowerCase();

        if (firstSentence.contains(searchWord)) {
            Integer index = firstSentence.indexOf(searchWord);
            Integer length = searchWord.length();

            System.out.println("Word appears at index " + index + ". Your word is " + length + " letters long.");
            String sentenceMinusSearchWord = firstSentence.replace(searchWord, "");
            System.out.println(sentenceMinusSearchWord);
        } else {
            System.out.println("Womp Womp");
        }
    }
}
