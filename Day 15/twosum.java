import java.util.*;
class twosum{
    public int[] twoSum(int[] a,int target){
for(int i=0;i<a.length;i++){
    for(int j=i+1;j<a.length;j++){
        if(a[i]+a[j]==target){
            return new int[]{i,j};
        }
    }
}
return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int target=sc.nextInt();
    
        twosum obj=new twosum();
        int[] result=obj.twoSum(a,target);
        System.out.print("Indices: " + result[0]+ " " + result[1]);
    }
}
