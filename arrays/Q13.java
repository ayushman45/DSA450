package arrays;

import java.util.Scanner;

public class Q13 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		//CODE HERE
		int sum = 0;
		boolean check = true;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
			if (arr[i] >= 0) {
				check = false;
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum < 0) {
				sum = 0;
			}
		}
		if (check) {
			sum=min;
		}
		System.out.println("The Sum Of The Maximum Sum Sub-Array : " + sum);
	}

}
