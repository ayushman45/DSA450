package arrays;

import java.util.Scanner;

public class Q29 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total size : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int[] arr = A.array;

		int left[] = new int[size];
		 
        int right[] = new int[size];
 
        int water = 0;
 
        left[0] = arr[0];
        for (int i = 1; i < size; i++)
            left[i] = Math.max(left[i - 1], arr[i]);
 

        right[size - 1] = arr[size - 1];
        for (int i = size - 2; i >= 0; i--)
            right[i] = Math.max(right[i + 1], arr[i]);

        for (int i = 0; i < size; i++)
            water += Math.min(left[i], right[i]) - arr[i];
        
        
        System.out.println("Total Water : "+water);
	}
}
