//Find Subarray With Maximum Sum (Kadane's Algorithm)
import java.util.*;
import java.io.*;

public class Kadane {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }   
    int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
            sum+=a[j];
            maxsum=Math.max(sum,maxsum);
        }
    }
    System.out.print(maxsum);
}
}
