package arrays;

import java.util.Scanner;

public class Q21 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		//CODE HERE
		
		int i1=0,i2=0;
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==0) {
					i1=i;i2=j;
				}
			}
			sum=0;
		}
		System.out.println("Largest subarray of sum 0 is between index : "+i1+" & "+i2);
	}

}
