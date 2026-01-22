Integer Overflow Check-crtprep
Problem
Given two long integers A and B, compute their product. If the product fits within an int data type (i.e., within [−231, 231 − 1]), output the product as an int; otherwise, output -1.

Input Format

Two long integers A and B.

Constraints

−1012 ≤ A, B ≤ 1012

Output Format

Output the product as an int if it fits within int range; otherwise, output -1.

Sample Input 0

1000 2000
Sample Output 0

2000000
Sample Input 1

1000000 1000000
Sample Output 1

-1




SOLUTION:::::::::::::::::::::
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long A=in.nextLong();
        long B=in.nextLong();
         long prod=A*B;
        if(prod>=Integer.MIN_VALUE && prod<=Integer.MAX_VALUE){
            System.out.println((int)prod);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
