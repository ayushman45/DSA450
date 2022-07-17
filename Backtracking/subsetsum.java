import java.util.*;

public class subsetsum {
    static int[]w;
    static int W;
    static int ans=0;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of jobs : ");
        int n=sc.nextInt();
        w=new int[n];
        int total=0;
        System.out.println("Enter max weight of knapsack : ");
        W=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("For job "+i);
            System.out.println("Enter weight : ");
            w[i]=sc.nextInt();
            total+=w[i];
        }
        ss(n,0,total);
        System.out.println(ans==W);
    }
    private static void ss(int n,int i, int total) {
        if(n==0||i>W || i+total<W){
            return;
        }
        if(i==W)
            ans=W;
        
        ss(n-1,i,total-w[n-1]);
        ss(n-1,i+w[n-1],total-w[n-1]);
    }
}
