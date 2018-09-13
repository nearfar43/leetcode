package array;

import java.util.Arrays;

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
 */

public class PlusOne {


	public static int[] solution(int[] numbers) {

		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] < 9) {
				numbers[i] += 1;
				return numbers;
			}
			else {
				numbers[i] = 0;
			}
		}
		int[] newNumbers = new int [numbers.length + 1];
		newNumbers[0] = 1;
		
		return newNumbers;
	}

	public static void main(String[] args) {
		int[] numbers = {9, 9, 9};
		
		System.out.println(Arrays.toString(solution(numbers)));

	}

}
