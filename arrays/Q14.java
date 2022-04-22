package arrays;

import java.util.Scanner;

public class Q14 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total intervals : ");
		int size = sc.nextInt();
		int[][] intervals = new int[size][2];
		for (int i = 0; i < size; i++) {
			System.out.println("For interval "+(i+1)+" : ");
			System.out.println("Enter beginning of interval :");
			intervals[i][0] = sc.nextInt();
			System.out.println("Enter end of interval :");
			intervals[i][1] = sc.nextInt();
		}
		print(intervals);
		
		int i=0;
		while(i<intervals.length-1) {
			if(intervals[i][1]>intervals[i+1][0]) {
				intervals=delete(intervals,i);
			}
			else {
				i++;
			}
		}
		
		print(intervals);

		// CODE HERE

	}

	static int[][] delete(int[][] array, int i) {
		int[][] arr=new int[array.length-1][2];
		for(int j=0;j<i;j++) {
			arr[j][0]=array[j][0];
			arr[j][1]=array[j][1];
		}
		arr[i][0]=array[i][0];
		arr[i][1]=Math.max(array[i][1], array[i+1][1]);
		for(int j=i+2;j<array.length;j++) {
			arr[j-1][0]=array[j][0];
			arr[j-1][1]=array[j][1];
		}
		return arr;
	}

	static void print(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" [ ");
			System.out.print(arr[i][0]+" , "+arr[i][1]);
			System.out.print(" ] ");
		}
		
		System.out.println();

	}

}
