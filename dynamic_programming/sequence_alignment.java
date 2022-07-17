package dynamic_programming;
import java.util.*;
public class sequence_alignment {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter first String : ");
		String str1=sc.next();
		System.out.println("Enter second String : ");
		String str2=sc.next();
		System.out.println("Enter gap penalty : ");
		int gap=sc.nextInt();
		System.out.println("Enter mismatch penalty : ");
		int mismatch=sc.nextInt();
		int cost=sequence_alignment_cost(str1,str2,gap,mismatch);
		System.out.println("Minimum penalty cost : "+cost);
	}
	private static int sequence_alignment_cost(String str1, String str2, int gap, int mismatch) {
		// TODO Auto-generated method stub
		int m=str1.length();
		int n=str2.length();
		int [][]dp=new int[m+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				
				if(i==0){
					dp[i][j]=j*gap;
				}
				else if(j==0){
					dp[i][j]=i*gap;
				}
				else{
					dp[i][j]=Math.min(dp[i-1][j]+gap, Math.min(dp[i][j-1]+gap, match(i,j,str1,str2,mismatch)+dp[i-1][j-1]));
				}
				
			}
		}
		return dp[m][n];
	}
	private static int match(int i, int j, String str1, String str2,int mismatch) {
		// TODO Auto-generated method stub
		if(str1.charAt(i-1)==str2.charAt(j-1)) {
			return 0;
		}
		
		return mismatch;
	}
	
}
