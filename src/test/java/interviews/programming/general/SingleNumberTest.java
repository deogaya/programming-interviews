package interviews.programming.general;

import org.junit.Assert;
import org.junit.Test;

import interviews.programming.general.SingleNumber;


public class SingleNumberTest {

	SingleNumber singleNumber = new SingleNumber();
	
	@Test
	public void testSingleValue() {
		int[] nums = {1};
		Assert.assertEquals(1, singleNumber.singleNumber(nums));
	}
	
	@Test
	public void testTwoValues() {
		int[] nums = {1, 2, 2};
		Assert.assertEquals(1, singleNumber.singleNumber(nums));
	}
	
	@Test
	public void testMultipleValues() {
		int[] nums = {1, 2, 2, 4, 5, 7, 8, 6, 7, 5, 4, 8, 6};
		Assert.assertEquals(1, singleNumber.singleNumber(nums));
	}
}
