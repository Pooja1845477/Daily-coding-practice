import java.util.*;
import java.io.*;
public class count_pos_neg {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        }
        int pos=0,neg=0;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.print("\nPositive: "+pos);
        System.out.print("\nNegative: "+neg);
   } 
}
