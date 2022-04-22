package matrix;

import java.util.Scanner;

public class Q02 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows of matrix : ");
		int row=sc.nextInt();
		System.out.println("Enter no of cols of matrix : ");
		int col=sc.nextInt();
		Matrix A=new Matrix(row,col);
		int[][]matrix=A.matrix;
		
		//code here
		
		System.out.println("Enter number to search : ");
		int num=sc.nextInt();
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(matrix[j][i]==num) {
					System.out.println("Element present at row : "+(i+1)+" and col : "+(j+1));
					System.exit(0);
				}
			}
		}
		
		System.out.println("Element not present in array.");
		
	}

}
