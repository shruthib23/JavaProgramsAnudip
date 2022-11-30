class NonRepeatedString
{
static void printStringCharacter(String s)
{
for(int i=0;i<s.length();i++)
System.out.println("1t"+s.charAt(i));
System.out.println();
}
static void non_RepeatedStringCharacter(String s)
{
for(char i:s.toCharArray())
{
if(s.indexOf(i)==s.lastIndexOf(i))
{
System.out.println("First non repeating character is:" +i);
break;
}
}
}
public static void main(String args[])
{
String str="madam";
printStringCharacter(str);
non_RepeatedStringCharacter(str);
System.out.println(str);
}
}