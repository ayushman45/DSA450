package arrays;

import java.util.Scanner;

public class Q24 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int array[]=new int[max+1];
		
		int seq=0,maxseq=0;
		for(int i=0;i<arr.length;i++) {
			array[arr[i]]=1;
		}
		
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) {
				seq++;
				if(maxseq<seq) {
					maxseq=seq;
				}
			}
			
			if(array[i]==0) {
				seq=0;
			}
		}
		System.out.println("Longest consecutive subsequence is : "+maxseq);
	}

}
