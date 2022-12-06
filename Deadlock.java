public class Deadlock 
{
public static void main(String[] args) 
{
final String resource1 = "Srilekha";
final String resource2 = "Supriya";
Thread t1 = new Thread() 
{
public void run() 
{
synchronized (resource1) 
{
System.out.println("Thread 1: resource 1 locked");
try 
{
Thread.sleep(200);
} 
catch(Exception e) {}
synchronized (resource2) 
{
System.out.println("Thread 1: resource 1 locked.");
}
}
}
};
Thread t2 = new Thread() 
{
public void run() 
{
synchronized (resource2) 
{
System.out.println("Thread 2: resource 2 locked ");
try 
{
Thread.sleep(100);
}
catch(Exception e) {}
synchronized (resource1) 
{
System.out.println("Thread 2: resource 1 locked.");
}
}
}
};
t1.start(); 
t2.start();
}
}