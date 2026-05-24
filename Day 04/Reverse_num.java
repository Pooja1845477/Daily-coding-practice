import java.io.*;
import java.util.*;

public class Reverse_num {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.print(rev);
    }
}
