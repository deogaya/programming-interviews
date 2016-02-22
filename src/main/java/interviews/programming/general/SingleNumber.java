package interviews.programming.general;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		if (nums.length == 0) {
			throw new IllegalArgumentException("Nums cannot be empty");
		}
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
	}
}
