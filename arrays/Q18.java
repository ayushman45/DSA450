package arrays;

import java.util.Scanner;

public class Q18 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		//CODE HERE
		
		System.out.println("Enter number to check sum : ");
		int sum=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println("Pairs "+arr[i]+" and "+arr[j]+" sum upto "+sum);
				}
			}
		}
	}

}
