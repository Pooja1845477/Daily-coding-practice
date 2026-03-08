
import java.io.*;
import java.util.*;

public class left_rotate_arr {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int first=a[0];
    Arrays.sort(a);
    for(int i=0;i<n-1;i++){
        a[i]=a[i+1];
    }
    a[n-1]=first;
    for(int i=0;i<n;i++)
    System.out.print(a[i]+" ");
}
}
