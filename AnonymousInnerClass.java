interface A 
{
void m1(); 
void m2();
}
class AnonymousInnerClass
{
public static void main(String arg[]) 
{
A a=new A() 
{
public void m1() 
{
System.out.println("M1 method");
}
public void m2() 
{
System.out.println("M2 method");
} 
};
a.m1(); 
a.m2(); 
}
}