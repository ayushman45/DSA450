package arrays;

import java.util.Scanner;

public class Q16 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		//CODE HERE
		
		int inv=0;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					inv++;
				}
			}
		}
		
		System.out.println("Maximum number of inversions is : "+inv);
		
	}

}
