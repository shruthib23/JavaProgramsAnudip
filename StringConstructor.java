class StringConstructor
{
public static void main(String args[])
{
String s1="abc";
System.out.println(s1);
String s2="";
System.out.println(s2);
String s3=new String();
System.out.println(s3);
String s4=new String("Hi");
System.out.println(s4);
String s5=new String(s1);
System.out.println(s5);
String s6=s1;
System.out.println(s6);
String s10=null;
System.out.println(s10);
//String s11=new String(null);
//System.out.println(s11);
String s12=new String(s10);
System.out.println(s12);
}
}