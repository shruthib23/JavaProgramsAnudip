public class NonStatic
{
int x=75;
void m()
{
System.out.println("non static M method");
}
{
System.out.println("non static block");
}
NonStatic()
{
System.out.println("Constructor");
}
public static void main(String args[])
{
System.out.println("main");
NonStatic obj=new NonStatic();
obj.m();
System.out.println(obj.x);
}
}