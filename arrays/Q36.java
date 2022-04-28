package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q36 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size of array 1 : ");
		int size1 = sc.nextInt();
		Array A = new Array(size1);
		int[] arr1 = A.array;
		System.out.println("Enter total size of array 2 : ");
		int size2 = sc.nextInt();
		Array B = new Array(size2);
		int[] arr2 = B.array;
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;
		int count = 0;
		count = ((size1 + size2 - 3) / 2);
		while (count > 0) {
			if (arr1[i] > arr2[j]) {
				j++;
			} else {
				i++;
			}
			count--;
		}

		if ((size1 + size2) % 2 == 0) {
			if (arr1[i] > arr2[2]) {
				j++;
			} else {
				i++;
			}
			double sum = 0;
			if (arr1[i] > arr2[2]) {
				sum += arr2[j];
				j++;
			} else {
				sum += arr1[i];
				i++;
			}

			if (arr1[i] > arr2[2]) {
				sum += arr2[j];
				j++;
			} else {
				sum += arr1[i];
				i++;
			}

			System.out.println("Median is : " + sum / 2.0);
		} else {
			if (arr1[i] > arr2[2]) {
				j++;
			} else {
				i++;
			}
			int temp;
			if (arr1[i] > arr2[2]) {
				 temp= arr2[j];
				j++;
			} else {
				 temp= arr1[i];
				i++;
			}
			System.out.println("Median is : " + temp);
		}

	}

}
