import java.io.FileWriter;
import java.io.IOException;
class WriteFile 
{// update the new text into file
public static void main(String args[])
{
try
{
FileWriter fwrite=new FileWriter("D:/JavaProgram/Hi.txt");
fwrite.write("Happy birthday");
fwrite.close();
System.out.println("write to the file done");
}
catch(IOException e)
{
e.printStackTrace();
}
}
}