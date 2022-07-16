package ds.array;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

	private List<Integer> findDuplicates(int[] input) {
		List<Integer> duplicates = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {

			int index = Math.abs(input[i]);
			if (input[index] < 0) {
				duplicates.add(index);
			}
			else {
				input[index] = -input[index];
			}

		}

		return duplicates;
	}

	public static void main(String[] args) {

		int[] input = { 1, 2, 3, 4, 3 };

		Duplicates obj = new Duplicates();

		List<Integer> duplicates = obj.findDuplicates(input);
		System.out.println(duplicates);
	}

}
