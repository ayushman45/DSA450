import java.util.*;
public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter N value for N x N board : ");
        int n=sc.nextInt();
        int[][]arr=new int[n][n];
    }
    static boolean nqueen(int[][]arr,int n){
        if(n==0){
            return;
        }
        return(!isAttack(arr))
    }
}
