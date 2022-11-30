class Bank
{
int getInterest()
{
return 0;
}
}
class SBI extends Bank
{
int getInterest()
{
return 8;
}
}
class HDFC extends Bank
{
int getInterest()
{
return 11;
}
}
class ICICI extends Bank
{
int getInterest()
{
return 7;
}
}
class Axis extends Bank
{
int getInterest()
{
return 9;
}
}
class Override
{
public static void main(String args[])
{
SBI s=new SBI();
System.out.println("SBI rate of interest:" +s.getInterest());
Axis a=new Axis();
System.out.println("Axis rate of interest:" +a.getInterest());
ICICI i=new ICICI();
System.out.println("ICICI rate of interest:" +i.getInterest());
}
} 