package array;

import java.util.Arrays;

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
		// TODO Auto-generated method stub
		int[] numbers = {9, 9, 9};
		
		System.out.println(Arrays.toString(solution(numbers)));

	}

}
