import java.util.ArrayList;
import java.util.List;
public class CollectionTest3
{
public static void main(String args[])
{
List<String>gamesList=new ArrayList<String>();
gamesList.add("Table tennis");
gamesList.add("Carrom");
gamesList.add("Shuttle");
gamesList.add("Chess");
System.out.println("-----------------Iterating by passing Lamda expression -------------");
gamesList.stream().forEachOrdered(games->System.out.println(games));
System.out.println("-----------------Iterating by passing method reference -------------");
gamesList.stream().forEachOrdered(System.out::println);
}
}