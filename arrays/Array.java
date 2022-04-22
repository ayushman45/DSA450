package arrays;

import java.util.Scanner;

public class Array {
	public static Scanner sc = new Scanner(System.in);
	int size;
	int [] array;
	
	Array(int size){
		array=new int[size];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter value :");
			array[i]=sc.nextInt();
		}
		this.print();
	}
	
	void print() {
		System.out.println();
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"  ");
		}
		System.out.println();
	}
}
