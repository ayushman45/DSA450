package arrays;

import java.util.Scanner;

public class Q04 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		Array A = new Array(size);
		int [] arr=A.array;
		int i=0,j=arr.length-1;
		boolean check=true;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>2||arr[k]<0) {
				check&=false;
			}
		}
		if(!check) {
			System.out.println("Invalid Input Array");
			System.exit(0);
		}
		while(i<j) {
			if(arr[i]==0) {
				i++;
			}
			if(arr[j]!=0) {
				j--;
			}
			if(i>j)break;
			if(arr[i]!=0&&arr[j]==0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		
		i=0;j=arr.length-1;
		while(i<j) {
			if(arr[i]!=2) {
				i++;
			}
			if(arr[j]==0) {
				j--;
			}
			if(i>j)break;
			if(arr[i]==2&&arr[j]!=2) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		A.array=arr;
		A.print();
	}

}
