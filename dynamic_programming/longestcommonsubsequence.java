package dynamic_programming;
import java.util.*;
public class longestcommonsubsequence {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter first string : ");
        String a=sc.next();
        System.out.println("Enter second string : ");
        String b=sc.next();
        char[] A=a.toCharArray();
        char[] B=b.toCharArray();
        int[][]dp=new int[A.length+1][B.length+1];
        int len=lcs(A,B,dp,A.length-1,B.length-1);
        System.out.println(len+" is the maximum length subsequence.");
    }
    private static int lcs(char[] a, char[] b, int[][] dp,int m,int n) {
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(a[i-1]==b[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
