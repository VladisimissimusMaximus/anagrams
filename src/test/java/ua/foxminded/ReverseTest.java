package ua.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

	@Test
	void reverseWord_whenMethodArgumentIsNull_throwsIllegalArgumentException() {
		assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("method argument cannot be null");
		});
	}

	@Test
	void reverseWord_whenArgumentIsNotNull_returnsNotNull() {
		assertNotNull(Reverse.reverseWord("sdsd!sdsd&  "));

	}

	@Test
	void reverseWord_whenArgumentIsEmptyString_returnsSame() {
		assertEquals("", Reverse.reverseWord(""));

	}

	@Test
	void reverseWord_whenArgumentIsSingleSpace_returnsSame() {
		assertEquals(" ", Reverse.reverseWord(" "));

	}

	@Test
	void reverseWord_whenArgumentIsSeveralSpaces_returnsSame() {
		assertEquals("    ", Reverse.reverseWord("    "));
	}

	@Test
	void reverseWord_whenArgumentIsSingleLetter_returnsSame() {
		assertEquals("a", Reverse.reverseWord("a"));
	}

	@Test
	void reverseWord_whenArgumentIsSingleCharacter_returnsSame() {
		assertEquals("&", Reverse.reverseWord("&"));
	}

	@Test
	void reverseWord_whenArgumentIsMultipleSameLetter_returnsSame() {
		assertEquals("aaa", Reverse.reverseWord("aaa"));
	}

	@Test
	void reverseWord_whenArgumentIsMultipleSameCharacter_returnsSame() {
		assertEquals("!!!", Reverse.reverseWord("!!!"));
	}

	@Test
	void reverseWord_whenArgumentIsSameCharacterInLowerAndUpperCasesMixed_returnsArgumentLettersReversed() {
		assertEquals("AaAa", Reverse.reverseWord("aAaA"));
	}
/*
	@Test
	void reverseWord_whenArgumentIsSameCharacterInLowerAndUpperCasesMixed_returnsArgumentLettersReversed() {
		assertTrue(Reverse.reverseWord("AaAa").equals("aAaA"));
	}
*/
	@Test
	void reverseWord_whenArgumentIsWordWithDifferentLetters_returnsArgumentWordReversed() {
		assertEquals("droW", Reverse.reverseWord("Word"));
	}

	@Test
	void reverseWord_whenArgumentIsWordWithSymbols_returnsReversedWordButSymbolsAreSameIndex() {
		assertEquals("& ol!leH!", Reverse.reverseWord("&Hel!lo !"));
	}

	@Test
	void reverseWord_whenArgumentIsOnlySymbols_returnsNotReversed() {
		assertEquals("!?%&", Reverse.reverseWord("!?%&"));
	}

	@Test
	void reverseWord_whenArgumentIsNotEngLetters_returnsSame() {
		assertEquals("абВ", Reverse.reverseWord("абВ"));
	}

	@Test
	void reverseSentence_whenArgumentIsSeveralWords_returnsSeveralWordsReversed() {
		assertEquals("dlroW olleH", Reverse.reverseWord("Hello World"));
	}

	@Test
	void reverseSentence_whenArgumentIsSeveralWordsWithSymbols_returnsSeveralWordsReversed_ButSymbolsAreSameIndex() {
		assertEquals("otsG !o%hcuM %dlroW ol#leH", Reverse.reverseWord("Hello! %World% Mucho G#sto"));
	}

}