class Record
{
public static void main(String args[])
{
record Person(String name, double weight,double height,String foodhabits)
{
Person()
{
this("Jaga",47,157,"non-veg");
}
public static void main(String args[])
{
Person p=new Person("Jaga",47,157,"non-veg");
System.out.println(p);
}
}
record Student(int rollno,String name,int marks)
{
Student()
{
this(42,"Shru",82);
}
public static void main(String args[])
{
Student s=new Student(43,"Shreya",72);
Student s1=new Student(44,"Shree",65);
Student s2=new Student(45,"Shravanya",84);
System.out.println(s);
System.out.println(s1);
System.out.println(s2);
}
}
record Employee(String empname,int empid,int salary)
{
Employee()
{
this("Deepak",21,30000);
}
public static void main(String args[])
{
Employee e=new Employee("Deepak",21,30000);
Employee e1=new Employee("Shruthi",23,25000);
System.out.println(e);
System.out.println(e1);
}
}
}
}