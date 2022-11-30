class StringMethods
{
public static void main(String args[])
{
String s1="Anudip foundation";
String s2="anudip";
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.indexOf("D"));
System.out.println(s1.indexOf("d"));
System.out.println(s1.substring(2));
System.out.println(s1.substring(2,5));
System.out.println(s1+"NGO");
System.out.println(s1.concat(s2));
System.out.println(s1.contains("dip"));
System.out.println(s1.startsWith("A"));
System.out.println(s1.endsWith("P"));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
System.out.println(s1.repeat(3)+"");
System.out.println(s2.replace('a','R'));
}
}

