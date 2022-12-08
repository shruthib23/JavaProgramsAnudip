import java.util.*;
class SampleGeneric
{
void m(ArrayList<String>al)
{
Iterator<String>itr=al.iterator();
while(itr.hasNext())
{
Object obj=itr.next();
String s=(String)obj;
System.out.println(s.toUpperCase());
}
}
}
class Generic
{
public static void main(String args[])
{
ArrayList<String>al=new ArrayList<String>();
al.add("anu");
al.add("shru");
//al.add(new Integer(100));
SampleGeneric s1=new SampleGeneric();
s1.m(al);
}
}