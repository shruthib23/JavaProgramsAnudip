public class Parameterized
{
int rollno;
String name;
Parameterized(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+""+name);
}
public static void main(String args[])
{
Parameterized p=new Parameterized(111,"shru");
p.display();
Parameterized p1=new Parameterized(112,"jaga");
p1.display();
}
}