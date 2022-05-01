package dynamic_programming;

import java.util.*;

public class Q06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of matrix : ");
		int num = sc.nextInt();
		int[] array = new int[num + 1];
		for (int i = 0; i <= num; i++) {
			System.out.println("Enter : ");
			array[i] = sc.nextInt();
		}
		int multiplication = mcm(array, num);
		System.out.println("The minimum number of multiplication is : " + multiplication);
	}

	private static int mcm(int[] array, int num) {
		// TODO Auto-generated method stub
		int[][] dp = new int[num + 2][num + 2];
		if (array.length <= 2) {
			return 0;
		}
		for (int i = 0; i < dp.length - 1; i++) {
			for (int j = 0; j < dp.length - 1; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = 0;
				else if (i == j || i > j) {
					dp[i][j] = 0;
				} else {

					for (int c = i; c < j; c++) {

						dp[i][j] = Math.min(dp[i][j], dp[i][c] + dp[c + 1][j] + array[i - 1] * array[c] * array[j]);

					}
				}
			}

		}
		return dp[num + 1][0];

	}
}
