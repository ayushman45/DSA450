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
		int median=0;
		if(arr.length%2!=0){
			median=arr[arr.length/2];
		}
		else {
			median=arr[arr.length/1]+arr[arr.length/2 -1];
		}
		
		System.out.println("Median element is "+median);
	}

}
