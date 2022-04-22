package matrix;

import java.util.Scanner;

public class Q04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of rows of matrix : ");
		int row = sc.nextInt();
		System.out.println("Enter no of cols of matrix : ");
		int col = sc.nextInt();
		Matrix A = new Matrix(row, col);
		int[][] matrix = A.matrix;

		// code here
		
		int max=0;
		int rowno=0;
		
		for(int i=0;i<row;i++) {
			int maximum=0;
			for(int j=0;j<col;j++) {
				if(matrix[j][i]==1)
					maximum++;
			}
			if(maximum>max) {
				max=maximum;
				rowno=i;
			}
		}
		
		System.out.println("Row with max 1's is : "+(rowno+1)+" having "+max+" 1's.");
		
	}

}
