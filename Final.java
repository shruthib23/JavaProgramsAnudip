interface Sample 
{
int x=58;
void read();
}
class Final implements Sample
{
public void read()
{
System.out.println("Hello Sample");
}
public static void main(String args[])
{
Sample s=new Final();
System.out.println(x);
s.read();
}
}