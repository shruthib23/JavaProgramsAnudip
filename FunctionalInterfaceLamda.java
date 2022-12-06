interface Writable 
{
void write(String s); 
}
public class FunctionalInterfaceLamda
{
public static void main(String[] args) 
{ 
Writable w=(String s)->System.out.println(s);
w.write("Java lamda");
}
}
