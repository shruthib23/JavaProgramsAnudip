import java.io.*;
class ReadFile 
{
public static void main(String args[]) throws FileNotFoundException,IOException 
{
FileInputStream fis=null;
fis=new FileInputStream("D:/JavaProgram/Hi.txt");
int i;
while((i=fis.read()) != -1)
{
System.out.print((char)i+""); 
}
fis.close();
}
}