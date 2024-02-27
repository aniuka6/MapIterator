import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {
    public static void main(String[] args) {
        Map<String, Person> people = new TreeMap<>();


        people.put("Kowalski", new Person("Jan", "Kowalski", 35) );
        people.put("Tokarz", new Person("Ola", "Tokarz", 24 ));
        people.put("Nowak", new Person("Ken", "Nowak", 40) );
        people.put("Lis", new Person("Ula", "Lis", 88) );

        Collection<Person> values = people.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}