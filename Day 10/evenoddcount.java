import java.util.*;

public class evenoddcount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            }
            else
                odd++;
        }
    System.out.println("Even:"+ even);
    System.out.println("Odd: "+odd);
}
}
