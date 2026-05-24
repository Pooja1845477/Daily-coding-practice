/*Given an array of n elements, find the majority element.

A majority element is an element that appears more than n/2 times in the array.
This program uses Boyer–Moore Majority Vote Algorithm.

This algorithm finds the majority element in O(n) time and O(1) space
*/
import java.util.*;
public class Majority_ele {
 public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;//count of vote
        int candidate=0;//candidate with majority vote
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=a[i];
            }
            if(a[i]==candidate)
                count++;
            else
                count--;
    

        }
        System.out.print(candidate);//printing candidate with maximum vote.
    }
}
