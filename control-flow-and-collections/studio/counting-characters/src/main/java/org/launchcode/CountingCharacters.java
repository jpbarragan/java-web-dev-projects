package org.launchcode;

import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args){
        String quote = "If the product of two terms is zero then common sense says at least one of " +
                "the two terms has to be zero to start with. So if you move all the terms over to one side," +
                " you can put the quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = quote.toCharArray();

        HashMap<Character, Integer> countingCharacters = new HashMap<>();

        for (char letter : charactersInString) {
            if (countingCharacters.containsKey(letter)) {
                countingCharacters.put(letter, countingCharacters.get(letter) + 1);
            } else {
                countingCharacters.put(letter, 1);
            }
        }

    }
}
