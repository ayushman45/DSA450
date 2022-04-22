package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int [] arr=A.array;
		
		Arrays.sort(arr);
		
		int index[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			index[arr[i]-1]=1;
		}
		for(int i=0;i<index.length;i++) {
			if(index[i]==0) {
				System.out.println(i+1+" is missing number.");
			}
		}
	}

}
