class Compute
{
void m1(int a)throws NegativeNumberException 
{
if(a<=0) 
{
throw new NegativeNumberException("Don't pass Negative number");
}
System.out.println("Result: "+a); 
}
}
class CustomException
{
public static void main(String args[]){
Compute c=new Compute();
try
{ 
c.m1(-25);
}
catch(NegativeNumberException ne)
{
System.out.println(ne);
}
}
}

