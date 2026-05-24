import java.util.*;
import java.io.*;

public class sorted_or_not {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    boolean sorted=true;
    for(int i=0;i<n;i++){
        if(a[i]>a[i+1])
            sorted=false;
        break;
    }
    if(sorted)
        System.out.print("Array is Sorted");
    else
        System.out.print("Array is not Sorted");
}
}