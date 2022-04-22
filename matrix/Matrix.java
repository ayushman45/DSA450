package matrix;
import java.util.Scanner;
public class Matrix {
	static Scanner sc=new Scanner(System.in);
	int[][]matrix;
	int row;
	int col;
	
	public Matrix(int row,int col){
		this.row=row;
		this.col=col;
		matrix=new int[this.col][this.row];
		System.out.println("Enter values of each position : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter value for A["+(i+1)+"]["+(j+1)+"] : ");
				matrix[j][i]=sc.nextInt();
			}
		}
		print();
	}
	
	void print() {
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[j][i]+"  ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
