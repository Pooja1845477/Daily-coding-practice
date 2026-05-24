import java.util.*;

public class UnionArray {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[m];
    for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
    for(int i=0;i<m;i++)
        b[i]=sc.nextInt();

    int union[]=new int[n+m];
    int k=0;
    for(int i=0;i<n;i++){
        union[k++]=a[i];
    }
    
    for(int i=0;i<m;i++){
boolean found=false;
for(int j=0;j<n;j++){
    if(b[i]==a[j]){
        found=true;
        break;

    }
}
if(!found){
    union[k++]=b[i];
}
    }
    // printing the unoin array with k indicies
    for(int i=0;i<k;i++){
        System.out.print(union[i]+" ");
    }
}
}
