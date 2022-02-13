import java.io.*;
import java.util.*;
public class factorial
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int result=1;
    for(int i=1;i<=n;i++)
    {
      result=result*i;
    }
    System.out.println("the factorial of the number is"+result);
  }
}
    
