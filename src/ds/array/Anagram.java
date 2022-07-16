package ds.array;

import java.util.Arrays;

public class Anagram {

	private boolean isAnagram(char[] word1, char[] word2) {

		if (word1.length != word2.length)
			return false;

		Arrays.sort(word1);
		Arrays.sort(word2);

		for (int i = 0; i < word1.length; i++) {
			if (word1[i] != word2[i]) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		String input1 = "listen";
		String input2 = "silent";

		Anagram obj = new Anagram();

		boolean result = obj.isAnagram(input1.toCharArray(), input2.toCharArray());
		System.out.println(result);

	}

}
