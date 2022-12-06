class Exception
{
public static void main(String args[])
{
try
{
var d=100/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("......");
}}