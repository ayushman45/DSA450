package string;

import java.util.*;


public class Q07 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(countAndSay(num));
	}
	
	static String countAndSay(int n) {
		if(n==1)return "1";
		String res=countAndSay(n-1);
		String s="";
		
		int counter=0;
		for(int i=0;i<res.length();i++) {
			counter++;
			if(i==res.length()-1||res.charAt(i)!=res.charAt(i+1)) {
				s=s+counter+res.charAt(i);
				counter=0;
			}
		}
		
		return s;
	}

}
