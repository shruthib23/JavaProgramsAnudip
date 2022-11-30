public class CheckMyNumber
{
static void min(int a[])
{
int min=a[0];
for(int i=0; i<a.length; i++)
if(min>a[i])
min=a[i];
System.out.println("Minimum value:" +min);
}
static void even(int a[])
{
System.out.println("even number:");
for(int i=0; i<a.length; i++)
{
if(a[i]%2==0)
{
System.out.println(a[i]);
}
}
}
static void odd(int a[])
{
System.out.println("odd number:");
for(int i=0; i<a.length; i++)
{
if(a[i]%2!=0)
{
System.out.println(a[i]);
}
}
}
static void prime(int a[])
{
int i,m=0,flag=0;
for(int j=0; j<a.length; j++)
{
m=a[j]/2;
if(a[j]==0||a[j]==1)
{
System.out.println(a[j]+" is not prime number");
}
else
{
for(i=2; i<m; i++)
{
if(a[j]%i==0)
{
System.out.println(a[j]+"is not prime number");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(a[j]+"prime number");
}
}
}
}
public static void main(String args[])
{
int a[]={98,54,21,7,85};
for(int k=0;k<5; k++)
System.out.println(""+a[k]);
min(a);
even(a);
odd(a);
prime(a);
}
}





