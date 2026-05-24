
   import java.io.*;
import java.util.*;

public class atmost_k_flip_longestsubarray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];//binary array
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       int zeros=0;
        int left=0;
        int maxlen=0;
        for(int right=0;right<n;right++){
            if(a[right]==0){
             zeros++;   
            }
            while(zeros>k){
                if(a[left]==0){
                 zeros--; 
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1); 
        }
       
        System.out.print(maxlen);
    }
} 

