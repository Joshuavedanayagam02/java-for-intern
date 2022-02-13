import java.io.*;
import java.util.*;
public class calculator
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter the second number");
    int b=sc.nextInt();
    System.out.println("enter the option");
    int c=sc.nextInt();
    int result;
    switch(c)
    {
      case 1:
        result=a+b;
        System.out.println("the addition is"+result);
        break;
      case 2:
        result=a-b;
        System.out.println("the subtraction is"+result);
        break;
      case 3:
        result=a*b;
        System.out.println("the multiplication is"+result);
        break;
      case 4:
        result=a/b;
        System.out.println("the division is"+result);
        break;
      case 5:
        result=a%b;
        System.out.println("the remainder is"+result);
        break;
      default:
        System.out.println("invalid operation");
    }
  }
}
   
