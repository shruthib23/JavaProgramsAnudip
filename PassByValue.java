class PassByValue
{
int a=10,b=20;
void m(int a)
{
System.out.println(a);
a=50;
System.out.println(a);
}
public static void main(String args[])
{
PassByValue p=new PassByValue();
System.out.println(p.a);
p.m(p.a);
}
}