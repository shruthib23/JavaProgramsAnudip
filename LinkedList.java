import java.util.*;
public class LinkedList
{
public static void main(String args[])
{
LinkedList<String>al=new LinkedList<String>();
al.add("Shru");
al.add("Deepak");
al.add("Jaga");
Iterator<String>itr=al.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}