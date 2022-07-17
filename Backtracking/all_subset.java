import java.util.Scanner;

public class all_subset {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s="";
        System.out.println("Enter all elements of set");
        s=sc.next();
        int n=s.length();
        subset( s,"",n);
    }
    static void subset(String s, String ans, int n){
        if(n==0){
            System.out.println(ans);
            return;
        }
        String a=ans+s.charAt(0);
        s=s.substring(1);
        subset(s,ans,n-1);
        subset(s,a,n-1);
    }
}
