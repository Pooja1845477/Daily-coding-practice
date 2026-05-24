import java.util.Scanner;

public class productExceptSelf {
public int[] productexceptself(int[] a) {
    int n=a.length;
    int[] result=new int[n];
    for(int i=0;i<n;i++){
        int prod=1;
        for(int j=i+1;j<n;j++){
if(i!=j){
    prod*=a[j];
}
        }
        result[i]=prod;
    }
    return result;
}
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        productExceptSelf obj = new productExceptSelf();

        int[] result = obj.productexceptself(a);

        System.out.println("Product of array except self:");

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}

