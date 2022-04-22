package arrays;

import java.util.Scanner;

public class Q12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of 1st array : ");
		int size1 = sc.nextInt();
		Array A = new Array(size1);
		System.out.println("Enter size of 2nd array : ");
		int size2 = sc.nextInt();
		Array B = new Array(size2);
		merge(A.array,B.array);
	}

	private static void merge(int[] array1, int[] array2) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		while(i<array1.length&&j<array2.length) {
			if(array1[i]<=array2[j]) {
				System.out.print(array1[i]+"  ");
				i++;
			}
			else {
				System.out.print(array2[j]+"  ");
				j++;
			}
		}
		if(i<array1.length) {
			for(int k=i;k<array1.length;k++) {
				System.out.print(array1[k]+"  ");
			}
		}
		else {
			for(int k=j;k<array2.length;k++) {
				System.out.print(array2[k]+"  ");
			}
		}
	}

}
