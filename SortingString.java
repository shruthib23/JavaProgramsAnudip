import java.util.Arrays;
public class SortingString
{
public static void main(String args[])
{
String[]sa={"mango","apple","grapes","banana"};
for(int i=0;i<sa.length;i++)
{
for(int j=i+1;j<sa.length;j++)
{
if(sa[i].compareTo(sa[j])>0)
{
String temp=sa[i];
sa[i]=sa[j];
sa[j]=temp;
}
}
}
System.out.println(Arrays.toString(sa));
}
}n