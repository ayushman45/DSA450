package arrays;

import java.util.Scanner;

public class Q06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array 1: ");
		int size1 = sc.nextInt();
		Array A = new Array(size1);
		System.out.println("Enter size of array 2: ");
		int size2 = sc.nextInt();
		Array B=new Array(size2);
		int [] arr1=A.array;
		int[]arr2=B.array;
		if(arr1.length>arr2.length) {
			union(arr1,arr2);
		}
		else {
			union(arr2,arr1);
		}
		
		intersection(arr1,arr2);
		
	}
	
	static void union(int[]arr1,int[]arr2) {
		System.out.println();
		System.out.println("Union of the array is :");
		int i=0,j=0;
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				System.out.print(arr1[i]+"  ");
				i++;
			}
			else if(arr1[i]>=arr2[j]) {
				System.out.print(arr2[j]+"  ");
				j++;
			}
		}
		while(i<arr1.length) {
			System.out.print(arr1[i]+"  ");
			i++;
		}
		System.out.println();
	}
	
	static void intersection(int[]arr1,int[]arr2) {
		System.out.println();
		System.out.println("Intersection of the array is :");
		int i=0,j=0;
		
		while(i<arr1.length&&j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr1[i]>arr2[j]) {
				j++;
			}
			else if(arr1[i]==arr2[j]){
				System.out.print(arr2[j]+"  ");
				i++;j++;
			}
		}
		System.out.println();
	}


}
