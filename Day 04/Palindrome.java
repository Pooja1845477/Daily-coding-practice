import java.io.*;
import java.util.*;


    

public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      
        int temp=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(temp==rev){
            System.out.print("Palindrome");

        }
        else
            System.out.print("NOT a Palindrome");
}
}