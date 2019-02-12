import java.io.*;
import java.util.*;
public class Printdigit
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int num=s.nextInt();
String str=Integer.toString(num);
for(int i=0;i<str.length();i++)
{
System.out.println(str.charAt(i));
}
}
}
