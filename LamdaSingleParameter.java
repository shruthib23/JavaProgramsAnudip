interface Sayable 
{
String say(String name); 
}
public class LamdaSingleParameter 
{
public static void main(String arg[]) 
{
Sayable s=(name)->{return "Hi Lamda: "+name;};
System.out.println(s.say("Shru")); 
}
}