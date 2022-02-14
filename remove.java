import java.util.ArrayList;
import java.util.List;
public class remove
{
  public static void main(String args[])
  {
    List<Integer> al=new ArrayList<>();
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(1);
    al.add(2);
    System.out.println(al);
    al.remove(new Integer(1));
    al.remove(new Integer(2));
    System.out.println(al);
  }
}
    
