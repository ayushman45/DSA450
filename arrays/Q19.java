package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q19 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size of array 1 : ");
		int size1 = sc.nextInt();
		Array A = new Array(size1);
		int[] arr1 = A.array;
		Arrays.sort(arr1);

		System.out.println("Enter total size of array 2 : ");
		int size2 = sc.nextInt();
		Array B = new Array(size2);
		int[] arr2 = B.array;
		Arrays.sort(arr2);

		System.out.println("Enter total size of array 3 : ");
		int size3 = sc.nextInt();
		Array C = new Array(size3);
		int[] arr3 = C.array;
		Arrays.sort(arr3);

		// CODE HERE

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				System.out.print(arr1[i] + " ");
				i++;
				j++;
				k++;
			}

			else if (arr1[i] < arr2[j])
				i++;

			else if (arr2[j] < arr3[k])
				j++;

			else
				k++;
		}
	}
}
