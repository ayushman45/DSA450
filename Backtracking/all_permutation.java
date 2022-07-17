import java.util.*;

class all_permutation{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter string : ");
        String s=sc.next();
        int n=s.length();
        permute(s,"",n);
    }
    private static void permute(String s, String ans,int n) {
        if(n==0){
            System.out.println(ans);
        }
        for(int i=0;i<n;i++){
            String x=s.substring(0,i)+s.substring(i+1);
            permute(x,ans+s.charAt(i),n-1);
        }
    }
}