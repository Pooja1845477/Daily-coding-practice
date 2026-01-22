//package Day 01;

//public class sumofarray {
    
//}
import java.util.*;
import java.io.*;
public class sumofarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        
        }
        int sum=0;
        for(int i=0;i<n;i++){
sum+=a[i];
        }
        System.out.print(sum);
    }
}