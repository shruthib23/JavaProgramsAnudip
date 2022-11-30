class MinValueArray
{
public static void main(String args[])
{
int a[]={55,8,79,12,2,92,41,82,77,5,65};
int minValue=a[0];
for(int i=0;i<a.length;i++)
if(minValue>a[i])
minValue=a[i];
System.out.print("min value:"+minValue);
}
}
