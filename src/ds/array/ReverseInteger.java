package ds.array;

public class ReverseInteger {

	private int reverse(int number) {
		int reversed = 0;

		while (number > 0) {
			reversed = reversed * 10 + (number % 10);
			number = number / 10;
		}

		return reversed;
	}

	public static void main(String[] args) {

		int number = 1234;

		ReverseInteger obj = new ReverseInteger();

		int result = obj.reverse(number);
		System.out.println(result);

	}

}
