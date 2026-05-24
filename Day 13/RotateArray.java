import java.util.*;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
int k=sc.nextInt();
        k=k%n;
        for(int r=0;r<k;r++){
            int first=a[0];
            for(int i=0;i<n-1;i++){
                a[i]=a[i+1];
            }
            a[n-1]=first;
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
