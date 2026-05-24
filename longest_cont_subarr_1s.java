
    import java.io.*;
import java.util.*;

public class  longest_cont_subarr_1s{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
            int max=0;
        int currentLen=0;
        for(int right=0;right<n;right++){
          if(a[right]==1){
            currentLen++;
            max=Math.max(max,currentLen);
          } 
            else{
                currentLen=0;//resetting the window
            }
        }
       System.out.print(max); 
    }
}

