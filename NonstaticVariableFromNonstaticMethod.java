public class NonstaticVariableFromNonstaticMethod
{
int x=75,y=50;
void printXY()
{
System.out.println(+x+""+y);
}
void setXY(int x,int y)
{
this.x=x;
this.y=y;
}
public static void main(String args[])
{
NonstaticVariableFromNonstaticMethod n=new NonstaticVariableFromNonstaticMethod();
NonstaticVariableFromNonstaticMethod n1=new NonstaticVariableFromNonstaticMethod();
n.setXY(75,85);
n.printXY();
n1.setXY(9,6);
n1.printXY();
}
}