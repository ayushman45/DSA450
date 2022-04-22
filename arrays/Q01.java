package arrays;

import java.util.Scanner;

public class Q01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		A.array = arr;
		A.print();
	}

}
