class Addition 
{
static int add(int a, int b)
{
if(a<=0||b<=0)
throw new IllegalArgumentException("Don't pass number<=0");
return a+b;
}
}
class IllegalArgumentException 
{
public static void main(String args[])
{
int res=Addition.add(3,-4);
int b=res+50;
System.out.println(b);
}
}
