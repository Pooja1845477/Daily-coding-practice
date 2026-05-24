import java.io.*;
import java.util.*;

public class many_missing {
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
            for(int missing = a[i]+1; missing < a[i+1]; missing++){
                    System.out.println("Missing number: " + missing);

        }
    }
}
}

}