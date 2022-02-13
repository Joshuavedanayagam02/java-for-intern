import java.io.*;
import java.util.*;
public class fibonacci
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int a=0,b=1,temp;
    for(int i=0;i<n;i++)
    {
      temp=a+b;
      System.out.println(temp);
      a=b;
      b=temp;
    }
  }
}
