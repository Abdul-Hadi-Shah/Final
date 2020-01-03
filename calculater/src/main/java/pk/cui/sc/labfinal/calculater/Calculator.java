package pk.cui.sc.labfinal.calculater;

public class Calculator {
	/**
	 * This will find the maximum among these integers
	 * @param num1 first integer
	 * @param num2 second integer
	 * @param num3 third integer
	 * @return maximum integer among them
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	/**
	 * This will calculate the square of positive integer which is less than 10
	 * @param num input integer
	 * @return square value
	 * @throws IllegalArgumentException when the input is not in between 0 and 10
	 */
	public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
			result = num * num;
		} else
			throw new IllegalArgumentException();
		return result;
	}
	/**
	 * This will calculate the cube of integer
	 * @param num input integer
	 * @return cube of that integer
	 */
	public int cube(int num){
		return num*num*num;
	}
}



