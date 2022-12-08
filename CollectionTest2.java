import java.util.ArrayList;
import java.util.List;
public class CollectionTest2
{
public static void main(String args[])
{
List<String>gamesList=new ArrayList<String>();
gamesList.add("Table tennis");
gamesList.add("Carrom");
gamesList.add("Shuttle");
gamesList.add("Chess");
System.out.println("-----------------Iterating by passing method-------------");
gamesList.forEach(System.out::println);
}
}