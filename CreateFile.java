import java.io.File;
import java.io.IOException;
class CreateFile 
{
public static void main(String args[]) 
{
File f=new File("D:/JavaProgram/Hi.txt");
try
{
if(f.createNewFile()) 
{
System.out.println("File " +f.getName()+" is File created.");
}
else 
{
System.out.println("File is already existed");
}
}
catch(IOException ioe)
{
System.out.println("An unexpected error");
ioe.printStackTrace();
}
}
}