package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q28 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		Arrays.sort(arr);

		int i = 0, j = arr.length - 1;

		while (i < j) {
			int midsum = arr[i]+arr[j];
			if (midsum <= sum) {
				for (int k = i+1; k < arr.length; k++) {
					if(k==j)continue;
					if (midsum + arr[k] == sum) {
						System.out.println("Yes the triplet that add up to give the sum " + sum + " is " + arr[i] + " , "+arr[j]+" and "+arr[k]);
						j--;i++;
						break;
					}
					
				}
				i++;
			}
			else {
				j--;
			}
		}
		
		

	}

}
