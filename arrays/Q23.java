package arrays;

import java.util.Scanner;

public class Q23 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		//CODE HERE
		 int ans=1,mul=1;
		 
		 for(int i=0;i<arr.length;i++) {
			 mul=1;
			for(int j=i;j<arr.length;j++) {
				mul*=arr[j];
				if(mul==0) {
					mul=1;
					continue;
				}
				if(mul>ans) {
					ans=mul;
				}
			}
		 }
		 
		 System.out.println("Largest product subarray is : "+ans);
		

	}

}
