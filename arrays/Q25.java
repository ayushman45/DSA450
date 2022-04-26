package arrays;

import java.util.Scanner;

public class Q25 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		System.out.println("Enter a number k : ");
		int k=sc.nextInt();
		int freq=size/k;
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int array[]=new int[max+1];
		
		
		for(int i=0;i<arr.length;i++) {
			array[arr[i]]++;
		}
		System.out.println();
		for(int i=0;i<array.length;i++) {
			if(array[i]>freq) {
				System.out.print(i+"  ");
			}
		}
	}

}
