package org.launchcode;
import java.util.Scanner;


public class AliceSearch {
    public static void main (String[] args){
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice" +
                "‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("What word do you want to search for?");
        String word = input.next();
        input.close();

        System.out.println(alice.toLowerCase().contains(word.toLowerCase()));
        System.out.println("Your word is at index " + alice.toLowerCase().indexOf(word.toLowerCase()) + " has a " +
                "length of " + word.length() + " characters.");
        String aliceCut = alice.replace(word, "");
        System.out.println(aliceCut);
    }
}
