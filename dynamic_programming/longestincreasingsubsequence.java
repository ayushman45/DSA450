import java.util.*;
public class longestincreasingsubsequence {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        while(true){
            System.out.println("Enter 1 to add : ");
            System.out.println("Enter 0 to exit : ");
            int flag=sc.nextInt();
            if(flag==0){
                break;
            }
            else{
                int data=sc.nextInt();
                arr.add(data);
            }
        }
        int []a=new int[arr.size()];
        Arrays.fill(a, 1);
        for(int i=1;i<a.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(arr.get(i)>arr.get(j)){
                    max=Math.max(max, a[j]+1);
                }
            }
            a[i]=max;
        }
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(max, a[i]);
        }
        System.out.println(max+" is the maximum length of increasing subsequence.");
    }
    
}
