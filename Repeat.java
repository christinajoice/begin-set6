import java.io.*;
import java.util.*;
public class Repeat
{
public static void main(String args[])
{
int count=0
Scanner s=new Scanner(System.in);
System.out.println("Enter number of digits");
int N=s.nextInt();
System.out.println("Enter search number");
int K=s.nextInt();
System.out.println("Enter the digits");
for(int i=0;i<N;i++)
int n[i]=s.nextInt();
for(int i=0;i<N;i++)
{
if(K==n[i])
++unt;
}
System.out.println(count);
}
}
