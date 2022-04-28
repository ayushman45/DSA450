package string;
import java.util.*;
public class Q02 {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a String : ");
		String string=sc.next();
		boolean check=true;
		
		int i=0,j=string.length()-1;
		
		while(i<j) {
			if(string.charAt(i)!=string.charAt(j)) {
				check=false;
				break;
			}
			i++;j--;
		}
		if(check) {
			System.out.println("Pallindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
	}

}
