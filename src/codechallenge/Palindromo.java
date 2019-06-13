package codechallenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Palindromo {

	public static boolean isPalindrome(String word) {
		word = word.replace(" ", "");
		List<String> listofLetters = Arrays.asList(word.split(""));

		IntPredicate validLetter = i -> listofLetters.get(i)
				.equalsIgnoreCase(listofLetters.get((listofLetters.size() - 1) - i));

		long counter = IntStream.range(0, listofLetters.size()).filter(validLetter).count();

		return counter == listofLetters.size();
	}

	public static void main(String args[]) {

		System.out.println(isPalindrome("Menem"));
		System.out.println(isPalindrome("Seres"));
		System.out.println(isPalindrome("sometemos"));
		System.out.println(isPalindrome("arenera"));
		System.out.println(isPalindrome("Alli si Maria avisa y asi va a ir a mi silla"));

	}

}
