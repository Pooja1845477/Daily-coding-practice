//package Day 06;
import java.util.*;
import java.io.*;

public class linearsearch {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    int index=-1;//assume element never found
    for(int i=0;i<n;i++){
        if(a[i]==key){
           index=i;
           break;
        }}
        if(index !=-1)
         System.out.println("Found at: "+index);
        else
            System.out.println("Element not found");
    
 }   
}
