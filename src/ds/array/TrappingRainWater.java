package ds.array;

public class TrappingRainWater {

	private int solve(int[] heights) {

		if (heights.length < 3) {
			return 0;
		}

		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];

		leftMax[0] = 0;
		for (int i = 1; i < heights.length; i++) {
			leftMax[i] = Math.max(leftMax[i - 1], heights[i - 1]);
		}

		rightMax[heights.length - 1] = 0;
		for (int i = heights.length - 2; i >= 0; i--) {
			rightMax[i] = Math.max(rightMax[i + 1], heights[i + 1]);
		}

		int trapped = 0;

		for (int i = 1; i < heights.length - 1; i++) {
			if (Math.min(leftMax[i], rightMax[i]) > heights[i]) {
				trapped += Math.min(leftMax[i], rightMax[i]) - heights[i];
			}
		}

		return trapped;
	}

	public static void main(String[] args) {

		TrappingRainWater obj = new TrappingRainWater();

		int[] heights = { 1, 0, 2, 1, 3, 1, 2, 0, 3 };
//		int[] heights = { 9, 2, 10, 2, 2 };

		int result = obj.solve(heights);
		System.out.println(result);

	}

}
