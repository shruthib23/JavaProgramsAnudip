class NonStaticVariableUsingObject
{
static int a=100;
int x=75;
public static void main(String args[])
{
NonStaticVariableUsingObject n= new NonStaticVariableUsingObject();
NonStaticVariableUsingObject n1=new NonStaticVariableUsingObject();
NonStaticVariableUsingObject n2=new NonStaticVariableUsingObject();
System.out.println(a);
System.out.println(n.a);
System.out.println(n1.a);
System.out.println(n2.a);
System.out.println(n2.x);
}
}