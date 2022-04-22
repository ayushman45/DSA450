package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q09 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total number of buildings : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int [] arr=A.array;
		System.out.println("Enter value of k : ");
		int k=sc.nextInt();
		int res=height(arr,k);
		System.out.println(res+" is the maximum difference.");
	}
	
	static int height(int[]arr,int k) {
		Arrays.sort(arr);
		
		int mid=(arr.length-1)/2;
		
		for(int i=0;i<arr.length;i++) {
			if(i<=mid) {
				arr[i]+=k;
			}
			else {
				arr[i]-=k;
				if(arr[i]<0) {
					System.out.println("K value too large.");
					System.exit(0);
				}
			}
		}
		int max=arr[0],min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return max-min;
	}

}
