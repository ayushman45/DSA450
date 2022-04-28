package string;

import java.util.*;

public class Q05 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String1 : ");
		String string1 = sc.next();
		System.out.println("Enter a String2 : ");
		String string2 = sc.next();
		if(string1.length()==string2.length()&&(string1+string1).indexOf(string2)!=-1) {
			System.out.println("Strings are rotations of each other.");
		}
		else {
			System.out.println("Strings aren't rotations of each other.");
		}
	}

}
