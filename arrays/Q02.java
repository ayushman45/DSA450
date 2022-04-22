package arrays;

import java.util.Scanner;

public class Q02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[]arr=A.array;
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
			if(arr[i]<=min) {
				min=arr[i];
			}
		}
		System.out.println("Max value : "+max);
		System.out.println("Min value : "+min);
	}

}
