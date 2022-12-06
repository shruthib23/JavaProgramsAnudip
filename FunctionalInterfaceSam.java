interface Joju 
{
void m();
default void m1() 
{
 System.out.println("default hi");
}
 static void m2()
 {
 System.out.println("welcome Static");
 }
}
class FunctionalInterfaceSam implements Joju 
{
public void m()
{
System.out.println("Hello, Functional Interface");
}
public static void main(String args[]) 
{
Joju j=new FunctionalInterfaceSam();
j.m();
j.m1();
Joju.m2();
}
}