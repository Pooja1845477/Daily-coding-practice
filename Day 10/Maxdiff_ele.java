import java.util.*;
import java.io.*;

public class Maxdiff_ele {
    
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int maxDiff=a[1]-a[0];
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[j]-a[i]>maxDiff){
                maxDiff=a[j]-a[i];
            }
        }
    }
    System.out.println("Maximum Difference is : " + maxDiff);
} 
}
