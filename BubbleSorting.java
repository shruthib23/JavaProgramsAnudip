public class BubbleSorting
{
static void bubbleSort(int[]a)
{
//int temp=0;
for(int i=0;i<a.length;i++)
{
for(j=i+1;j<a.length;j++)
{
if(a[i]>a[j])
{
a[i]=a[i]+a[j];
a[j]=a[i]-a[j];
a[i]=a[i]-a[j];
}
/*if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}*/
}
}
}
public static void main(String args[])
{
int a[]={55,92,78,41,80};
for(int k=0;k<a.length;k++)
System.out.print(""+a[k]);
System.out.println("After swapping");
bubbleSort(a);
for(int l=0;l<a.length;l++)
{
System.out.print(a[l]+"");
}
}
}