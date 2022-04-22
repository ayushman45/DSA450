package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int [] arr=A.array;
		int k=0,jump=0;
		for(int i=0;i<arr.length;i+=k) {
			if(arr[i]==0) {
				System.out.println("We cant get to end of array");
				break;
			}
			else {
				k=arr[i];
				jump++;
			}
		}
		
		System.out.println("Total Jumps : "+jump);
	}

}
