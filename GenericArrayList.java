import java.util.*;
class GenericArrayList
{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<String>();
list.add("Shru");
list.add("Deepak");
list.add("Richard");
String s=list.get(2);
System.out.println("element is:"+s);
Iterator<String>itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}