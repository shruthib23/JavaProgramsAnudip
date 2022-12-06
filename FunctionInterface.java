interface Writable
{
void write(String s);
}
public class FunctionInterface implements Writable
{
public void write(String s)
{
System.out.println(s);
}
public static void main(String[] args)
{
FunctionInterface t=new FunctionInterface();
t.write("Anudip-Java");
}
}