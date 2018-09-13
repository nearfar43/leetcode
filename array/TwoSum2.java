package array;

import java.util.Arrays;

/**
 * 
 * @author jeffreycheng
 * 
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.
Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 *
 */

public class TwoSum2 {
	
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2)
        	return null;
        
        int[] indexArray = new int[2];
        int first = 0;
        int last = numbers.length - 1;
        
        while (first < last) {
        	int tempSum = numbers[first] + numbers[last];
        	if (tempSum == target) {
        		indexArray[0] = first + 1;
        		indexArray[1] = last + 1;
        		break;
        	}
        	else if (tempSum > target) 
        		last --;
        	else
        		first ++;
        	
        }
        
        return indexArray;
    }

	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		System.out.println(Arrays.toString(twoSum(numbers, 9)));

	}

}
