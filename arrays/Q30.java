package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		System.out.println("Enter no of students : ");
		int m=sc.nextInt();
		Arrays.sort(arr);
		int i=0,j=m-1,min=arr[size-1]-arr[0];
		while(j<arr.length) {
			if((arr[j]-arr[i])<min) {
				min=arr[j]-arr[i];
			}
			i++;
			j++;
		}
		System.out.println("Minimum difference is : "+min);
	}

}
