package dynamic_programming;

import java.util.Scanner;

public class knapsack {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter total WEIGHT : ");
		int W = sc.nextInt();
		System.out.println("Enter total no of jobs : ");
		int n = sc.nextInt();
		int[] job = new int[n + 1];
		job[0] = 0;
		int[] val = new int[n + 1];
		val[0] = 0;

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter weight of job : ");
			job[i] = sc.nextInt();
			System.out.println("Enter profit from job : ");
			val[i] = sc.nextInt();
		}
		int profit = knapsnack(W, n, job, val);
		System.out.println(profit + " is the profit.");
	}

	private static int knapsnack(int W, int n, int[] job, int[] val) {
		// TODO Auto-generated method stub
		int[][] dp = new int[n + 1][W + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= W; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (job[i] <= j)
					dp[i][j] = Math.max(val[i] + dp[i - 1][j - job[i]], dp[i - 1][j]);
				else
					dp[i][j] = dp[i - 1][j];
			}
		}

		return dp[n][W];
	}

}