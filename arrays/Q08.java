package arrays;

import java.util.Scanner;

public class Q08 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int [] arr=A.array;
		
		int sum=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			int intermediate=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				intermediate+=arr[j];
				if(intermediate>sum) {
					sum=intermediate;
				}
			}
		}
		
		System.out.println("Maximum sum is : "+sum);
	}

}
