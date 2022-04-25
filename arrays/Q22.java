package arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class Q22 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CODE HERE
		
		System.out.println("Enter number to find factorial : ");
		int num=sc.nextInt();
		BigInteger fact= new BigInteger("1");
		for(int i=2;i<=num;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println(fact.toString());
	}

}
