class Example
{
void add(int a,int b)
{
System.out.println(+(a+b));
}
void add(double d1,double d2)
{
System.out.println(+(d1+d2));
}
}
class Sample extends Example
{
void add(String s1,String s2)
{
System.out.println(s1+s2);
}
}
public class Overload
{
public static void main(String args[])
{
Sample s=new Sample();
s.add(10,20);
s.add(2.6,7.4);
s.add("hi","hello");
}
}