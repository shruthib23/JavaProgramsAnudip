import java.util.*;
class ArrayListCollection
{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<String>();
list.add("Vijay");
list.add("Ajay");
list.add("Sanjay");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}