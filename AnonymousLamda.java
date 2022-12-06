class AnonymousLamda 
{
public static void main(String args[]) 
{
Runnable r=()->{
for(int i=0; i<10; i++)
System.out.println("Thead-child"); 
};
Thread t=new Thread(r);
t.start();
for(int i=0;i<10;i++)
{
System.out.println("Main thread");
}
}
}