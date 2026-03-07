

import java.util.*;


public class count_vowel {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String str=sc.next();
int count=0;
for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
    count++;
}
}
System.out.print(count);
}
}
