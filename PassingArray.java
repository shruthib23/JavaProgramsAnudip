class PassingArray
{
static void min(int a[])
{
int minValue=a[0];
for(int i=0;i<a.length;i++)
if(minValue>a[i])
minValue=a[i];
System.out.println("Min element:" +minValue);
}
static void max(int a[])
{
int b=a[0];
for(int i=0;i<a.length;i++)
if(b<a[i])
b=a[i];
System.out.print("Big element:" +b);
}
public static void main(String args[])
{
int a[]={55,8,79,12,92,41,82,77,65};
System.out.println("Length of the array:" +a.length);
min(a);
max(a);
}
}