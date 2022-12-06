class Finally 
{
public static void main(String args[])
{
try
{
int d=25/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
finally
{ 
System.out.println("finally block is always executed");
}
}
}