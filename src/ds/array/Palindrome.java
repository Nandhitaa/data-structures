package ds.array;

public class Palindrome {

	private boolean isPalindrome(String input) {

		for (int forward = 0, backward = input.length() - 1; forward < backward; forward++, backward--) {
			if (input.charAt(forward) != input.charAt(backward))
				return false;
		}

		return true;

	}

	public static void main(String[] args) {

		Palindrome obj = new Palindrome();

		String input = "abcdcba";

		boolean result = obj.isPalindrome(input);
		System.out.println(result);
	}

}
