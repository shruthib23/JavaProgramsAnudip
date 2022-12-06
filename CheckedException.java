import java.io.*;
class CheckedException
{
public static void main(String args[])throws FileNotFoundException,IOException
{
FileInputStream fis=null;
fis =new FileInputStream("d:/JavaProgram/Welcome.txt");
int i;
while((i=fis.read())!=-1)
{
System.out.print((char)i+"");
}
fis.close();
}
}