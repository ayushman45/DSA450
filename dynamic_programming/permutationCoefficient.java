package dynamic_programming;
import java.util.Scanner;
public class permutationCoefficient {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter value of n : ");
        int n=sc.nextInt();
        System.out.println("Enter value of k : ");
        int k=sc.nextInt();
        int coeff=permutationCoeff(n,k);
        System.out.println("Binomial coefficient is "+coeff);
    }
    static int permutationCoeff(int n,int k){

    int C[][] = new int[n + 1][k + 1];
        int i, j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 )
                    C[i][j] = 1;
                else
                    C[i][j] = C[i - 1][j - 1]*j + C[i - 1][j];
            }
        }
 
        return C[n][k];
    }
}
