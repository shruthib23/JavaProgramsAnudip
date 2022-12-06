interface Addable 
{
int add(int a, int b); 
}
class LamdaMultipleParameters
{
public static void main(String args[]) 
{
Addable ad=(a,b)->(a+b);
//Addable ad=(a,b)->{return (a+b);};
System.out.println(ad.add(7,9)); 
}
}