import java.util.*;
import java.io.*;
public class second_max {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    
    int smax=0;
    int flag=0;
    Arrays.sort(a);
    for(int i=n-2;i>=0;i--){
if(a[i]!=a[n-1]){
    smax=a[i];
    flag=1;
    break;
}

    }
    if(flag==0){
        System.out.print("No second max");
    }
    else{
        System.out.print(smax);
    }
   } 
}
