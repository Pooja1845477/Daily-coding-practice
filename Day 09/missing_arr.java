import java.io.*;
import java.util.*;

public class missing_arr {
   public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int missing_num=-1;
    for(int i=0;i<n-1;i++){
        if(a[i+1]-a[i]>1){
             missing_num=a[i]+1;

        }
       
    }
    if(missing_num!=-1)
 System.out.println("Missing num : "+missing_num);
else
    System.out.println("No missing number in array");
}
}
