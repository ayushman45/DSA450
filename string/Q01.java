package string;
import java.util.*;
public class Q01 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String : ");
		String string=sc.next();
		String reverse="";
		for(int i=string.length()-1;i>=0;i--) {
			reverse+=string.charAt(i);
		}
		
		System.out.println("Reversed string is : "+reverse);
	}

}
