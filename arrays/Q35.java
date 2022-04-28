package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q35 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		Arrays.sort(arr);
		double median=0;
		int n=size/2;
		if(size%2==0){
			median=(arr[n-1]+arr[n])/2.0;
		}
		else {
			median=arr[n];
		}
		
		System.out.println("Median element is "+median);
	}

}
