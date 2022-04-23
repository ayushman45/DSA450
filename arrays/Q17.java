package arrays;

import java.util.Scanner;

public class Q17 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total stock prices on different days : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		//CODE HERE
		
		int max=0,index1=0,index2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]>max) {
					max=arr[j]-arr[i];
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println("Best time to buy stock is day "+(index1+1)+" and sell is day "+(index2+1)+" to get a profit of "+max);
	}

}
