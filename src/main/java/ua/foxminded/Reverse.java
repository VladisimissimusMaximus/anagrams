package ua.foxminded;

public class Reverse {

	private static final String SELECT_ALL_SYMBOLS_EXCEPT_ENG_LETTERS_FILTER = "[^A-Z, ^a-z]";
	private static final String WORD_SEPARATOR = " ";

	public static String reverseWord(String input) {

		//add several words check?
		//add null check
		if (input == null) {
			throw new IllegalArgumentException("argument cannot be null");
		}
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

		//add single word check?
		//add null check
		if (input == null) {
			throw new IllegalArgumentException("argument cannot be null");
		}
		String[] inputWords = input.split(WORD_SEPARATOR);
		String[] outputWords = new String[inputWords.length];

		for (int i = 0; i < inputWords.length; i++) {
			outputWords[i] = reverseWord(inputWords[i]);
		}
		return String.join(WORD_SEPARATOR, outputWords);

	}
}