public class TestFinalize
{
public static void main(String arg[])
{
TestFinalize f=new TestFinalize();
System.out.println(f.hashCode());
f=null;
System.gc();
System.out.println("End of the grabage collection");
}
@Override 
protected void finalize()
{ 
System.out.println("Called the finalize");
}
}