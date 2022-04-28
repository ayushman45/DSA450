package string;

import java.util.*;


public class Q06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String : ");
		String string = sc.next();
		System.out.println("Enter first set of characters A :");
		String A = sc.next();
		System.out.println("Enter second set of characters B :");
		String B = sc.next();
		boolean check = true;
		if (string.length() == (A.length() + B.length())) {
			for (int i = 0; i < string.length(); i++) {
				if (A.indexOf(string.charAt(i)) >= 0 || B.indexOf(string.charAt(i)) >= 0) {
					check &= true;
				} else {
					check = false;
				}
			}
			if (check) {
				System.out.println("String is shuffle of A and B");
			} else {
				System.out.println("String isn't shuffle of A and B");
			}
		} else {
			System.out.println("String isn't shuffle of A and B");

		}

	}

}
