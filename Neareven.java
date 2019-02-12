import java.io.*;
import java.util.*;
public class Neareven
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
if(num%2==0)
{
System.out.println(num);
}
else
{
System.out.println(num-1);
}
}
}
