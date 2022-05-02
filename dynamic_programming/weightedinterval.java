package dynamic_programming;
import java.util.*;

public class weightedinterval {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of jobs :");
        int jobs=sc.nextInt();
        int[] start=new int[jobs+1];
        int end[]=new int[jobs+1];
        int weight[]=new int[jobs+1];
        start[0]=0;end[0]=0;weight[0]=0;
        int M[]=new int[jobs+1];
        int P[]=new int[jobs+1];
        int pred[]=new int[jobs+1];
        for(int i=1;i<jobs+1;i++){
            System.out.println("enter weight of job 1 followed by starting time and finishing time :");
            weight[i]=sc.nextInt();
            start[i]=sc.nextInt();
            end[i]=sc.nextInt();
        }
        M[0]=0;P[0]=0;pred[0]=0;
        for(int i=1;i<jobs+1;i++){
            for(int j=0;j<i;j++){
                if(start[i]>=end[j]){
                    P[i]=j;
                }
            }
        }

        for(int i=1;i<jobs+1;i++){
    
                int data=weight[i]+M[P[i]];
                if(data>=M[i-1]){
                    M[i]=data;
                    pred[i]=P[i];
                }
                else{
                    M[i]=M[i-1];
                    pred[i]=i-1;
                }
            
        }

        System.out.println("Max weight is : "+M[jobs]);
    }
}
