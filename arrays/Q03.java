package arrays;

import java.util.Scanner;

public class Q03 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		System.out.println("Enter the value of k : ");
		int k=sc.nextInt();
		if(k>size || k==0) {
			System.out.println("Invalid Input, Size too small or k too large");
			System.exit(0);			
		}
		int ksmall=ksmall(A.array,k);
		int klarge=klarge(A.array,k);
		System.out.println("K-Small element is : "+ksmall);
		System.out.println("K-Large element is : "+klarge);
	}
	static int ksmall(int[]arr,int k) {
		int min=0;
		while(k-->0) {
			for(int i=min+1;i<arr.length;i++) {
				if(min>arr[i]) {
					int temp=arr[min];
					arr[min]=arr[i];
					arr[i]=temp;
				}
			}
			min++;
		}
		return arr[min-1];
	}
	static int klarge(int[]arr,int k) {
		int max=arr.length-1;
		while(k-->0) {
			for(int i=0;i<max;i++) {
				if(max<arr[i]) {
					int temp=arr[max];
					arr[max]=arr[i];
					arr[i]=temp;
				}
			}
			max--;
		}
		return arr[max+1];
	}
}
