import java.io.*;
import java.util.*;
public class percom
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st value");
    int a=sc.nextInt();
    System.out.println("enter 2nd value");
    int b=sc.nextInt();
    int i,n=1,r=1,v=1;
    float permutation,combination;
    for(i=1;i<=a;i++)
    {
      n=n*i;
    }
    for(i=1;i<=b;i++)
    {
      r=r*i;
    }
    for(i=1;i<=a-b;i++)
    {
      v=v*i;
    }
    permutation=n/v;
    System.out.println("permutation value is"+permutation);
    combination=n/(r*v);
    System.out.println("combination value is"+combination);
  }
}
