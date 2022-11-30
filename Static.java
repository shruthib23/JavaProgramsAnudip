public class Static 
{
static int a;
static int b;
int x;
int y;
static void m()
{
a=100;
b=200;
Static s=new Static();
s.x=300;
s.y=400;
System.out.println(+s.x+""+s.y);
}
public static void main(String args[])
{
System.out.println(+a+""+b);
m();
System.out.println(+a+""+b);
Static s1=new Static();
System.out.println(+s1.x+""+s1.y);
}
}