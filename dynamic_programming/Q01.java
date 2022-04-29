package dynamic_programming;

import java.util.Scanner;

public class Q01 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total amount : ");
		int W=sc.nextInt();
		System.out.println("Enter total no of denominations : ");
		int n=sc.nextInt();
		int[]a=new int[n+1];
		a[0]=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Enter : ");
			a[i]=sc.nextInt();
		}
		int[][]dp=new int[W+1][n+1];
		int ans=coinchange(W,n,a,dp);
		System.out.println(ans);
		
	}

	private static int coinchange(int W, int n, int[] a, int[][] dp) {
		// TODO Auto-generated method stub
		for(int i=0;i<=n;i++) {
			dp[0][i]=1;
		}
		for(int i=0;i<=W;i++) {
			dp[i][0]=0;
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=W;j++) {
				if(j<a[i]) {
					dp[j][i]=dp[j][i-1];
				}
				else {
					dp[j][i]=dp[j][i-1]+dp[j-a[i]][i];
				}
			}
		}
		return dp[W][n];
	}

}
