package ds.array;

import java.util.Arrays;

public class DutchNationalFlag {

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private int[] solve(int[] nums) {

		int zero = 0;
		int one = 0;
		int pivot = 1;
		int two = nums.length - 1;

		while (one <= two) {
			if (nums[one] < pivot) {
				swap(nums, one, zero);
				one++;
				zero++;
			}
			else if (nums[one] == pivot) {
				one++;
			}
			else {
				swap(nums, one, two);
				one++;
				two--;
			}
		}

		return nums;
	}

	public static void main(String[] args) {

		int[] nums = { 2, 2, 0, 1, 1, 0, 0 };

		DutchNationalFlag obj = new DutchNationalFlag();

		int[] result = obj.solve(nums);
		System.out.println(Arrays.toString(result));
	}

}
