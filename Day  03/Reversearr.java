//package Day  03;

//public class Reversearr {
    import java.util.*;
    import java.io.*;
    public class Reversearr{
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                for(int i=0;i<n/2;i++){
                    for(int j = n - 1 - i; j >= n - 1 - i; j--){
                       int temp=a[i];
                       a[i]=a[j];
                       a[j]=temp;
                    }
                }

            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
