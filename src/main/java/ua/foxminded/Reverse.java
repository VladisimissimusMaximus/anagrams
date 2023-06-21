package ua.foxminded;

public class Reverse {

    static final private String SELECT_ALL_SYMBOLS_EXCEPT_ENG_LETTERS_FILTER = "[^A-Z, ^a-z]";
    static final private String WORD_SEPARATOR = " ";

    public static String reverseWord(String input) {

        String inputAlphabetSymbols = input.replaceAll(SELECT_ALL_SYMBOLS_EXCEPT_ENG_LETTERS_FILTER, "");
        StringBuilder reversedWord = new StringBuilder(inputAlphabetSymbols).reverse();

        for (int i = 0; i < input.length(); i++) {
            if (Character.valueOf(input.charAt(i)).toString().matches(SELECT_ALL_SYMBOLS_EXCEPT_ENG_LETTERS_FILTER)) {
                reversedWord.insert(i, input.charAt(i));
            }
        }

        return reversedWord.toString();
    }

    public static String reverseSentence(String input) {
        String[] inputWords = input.split(WORD_SEPARATOR);
        String[] outputWords = new String[inputWords.length];

        for (int i = 0; i < inputWords.length; i++) {
            outputWords[i] = reverseWord(inputWords[i]);
        }
        return String.join(WORD_SEPARATOR, outputWords);
    }
}