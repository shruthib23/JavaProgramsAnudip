class Anonymous
{
public static void main(String args[]) 
{
Runnable r=new Runnable() 
{
public void run()
{
for(int i=0; i<10; i++) 
{
System.out.println("Thead-child");} 
}
};
Thread t=new Thread(r);
t.start();
for(int i=0;i<10;i++)
{
System.out.println("Main thread");}
}
}