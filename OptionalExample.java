import java.util.Optional;
class OptionalExample
{
public static void main(String args[])
{
String[] s=new String[10];
s[5]="ANUDIP FOUNDATION";
Optional checkNull=Optional.ofNullable(s[5]);
if(checkNull.isPresent())
{
String lowercaseString=s[5].toLowerCase();
System.out.println(lowercaseString);
}
else System.out.println("String is not there");
}
}