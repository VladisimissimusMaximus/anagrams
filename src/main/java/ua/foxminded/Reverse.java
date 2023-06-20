package ua.foxminded;

import java.util.regex.Pattern;

public class Reverse {
    public static String reverseWord(String input) {

        String onlyAlphabet = input.replaceAll("[^A-Z, ^a-z]", "");
        StringBuilder reversedWord = new StringBuilder(onlyAlphabet).reverse();

        for (int i = 0; i < input.length(); i++) {
            if (Character.valueOf(input.charAt(i)).toString().matches("[^A-Z, ^a-z]")) {
                reversedWord.insert(i, input.charAt(i));
            }
        }

        return reversedWord.toString();
    }

    public static String reverseSentence(String input) {
        String inputWords[] = input.split(" ");
        String outputWords[] = new String[inputWords.length];
        int i = 0;
        for (String inputWord : inputWords) {
            outputWords[i] = reverseWord(inputWord);
            i++;
        }
        return String.join(" ", outputWords);
    }
}