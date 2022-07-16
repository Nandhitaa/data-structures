package ds.array;

import java.util.Arrays;

public class ReverseArrayInPlace {

	private void reverse(int[] numbers) {

		for (int startIndex = 0, endIndex = numbers.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
			int temp = numbers[startIndex];
			numbers[startIndex] = numbers[endIndex];
			numbers[endIndex] = temp;
		}

	}

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };

		ReverseArrayInPlace obj = new ReverseArrayInPlace();

		System.out.println(Arrays.toString(numbers));
		obj.reverse(numbers);
		System.out.println(Arrays.toString(numbers));
	}

}
