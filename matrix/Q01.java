package matrix;

import java.util.Scanner;

public class Q01 {
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
		
		int left=0,top=0,right=col-1,bottom=row-1,direction=0;
		while(top<=bottom&&left<=right) {
			if(direction==0) {
				for(int i=left;i<=right;i++) {
					System.out.print(matrix[i][top]+"  ");
				}
				top++;
				direction=1;
			}
			else if(direction==1) {
				for(int i=top;i<=bottom;i++) {
					System.out.print(matrix[right][i]+"  ");
				}
				right--;
				direction=2;
			}
			else if(direction==2) {
				for(int i=right;i>=left;i--) {
					System.out.print(matrix[i][bottom]+"  ");
				}
				bottom--;
				direction=3;
			}
			else {
				for(int i=bottom;i>=top;i--) {
					System.out.print(matrix[left][i]+"  ");
				}
				left++;
				direction=0;
			}
		}
	}

}
