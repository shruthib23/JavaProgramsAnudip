import java.util.*;
public class LamdaArrayList
{
public static void main(String args[])
{
List<String>list=new ArrayList<String>();
list.add("shru");
list.add("deepak");
list.add("jaga");
list.forEach(
(n)->System.out.println(n));
}
}
