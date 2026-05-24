import java.util.Scanner;

public class freq_of_ele {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
   
        for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
     int key=sc.nextInt();
    int count=0;
    for(int i=0;i<n;i++){
        if(key==a[i]){
            count++;
        }
    }
    System.out.print("Frequency of"+key+"="+count);
   } 
}
