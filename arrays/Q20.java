package arrays;

import java.util.Scanner;

public class Q20 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;

		// CODE HERE

		int i = 0;
		int j = 1;
		
			while (j < arr.length-1 && i < arr.length-1) {
				if (arr[i] < 0) {
					i += 2;
				}
				if (arr[j] >= 0) {
					j += 2;
				}
				if (arr[i] >= 0 && arr[j] < 0) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i += 2;
					j += 2;
				}
			
		} 
			A.array = arr;
			A.print();
		}
	

}
