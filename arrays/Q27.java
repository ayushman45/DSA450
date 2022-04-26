package arrays;

import java.util.Scanner;

public class Q27{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size of main array : ");
		int size1 = sc.nextInt();
		Array A = new Array(size1);
		int[] arr1 = A.array;
		
		System.out.println("Enter total size of sub array : ");
		int size2 = sc.nextInt();
		Array B = new Array(size2);
		int[] arr2 = B.array;
		
		boolean check=false,finalcheck=true;;
		for(int i=0;i<arr2.length;i++) {
			
			for(int j=0;j<arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					check|=true;
				}
				
			}
			finalcheck&=check;
			check=false;
		}
		
		if(finalcheck) {
			System.out.println("Yes second array is subarray of first.");
		}
		else {
			System.out.println("No Subarray");
		}
	}

}
