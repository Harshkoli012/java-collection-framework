package CollectionConcept.List;

import java.util.LinkedList;
import java.util.Vector;

public class ArrayListConcept {
    public static void main(String arg[]){
        Vector v = new Vector<>();
        v.add("Ram");
        v.add("Tom");
        v.add("Alex");
        v.add(20);
        LinkedList l = new LinkedList();
        l.add("Harsh");
        l.add("Rishika");
        l.add("Harsh");
        l.add("ABC");
        l.add(10);
        l.add(10.20);
        l.addAll(v);

        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.remove(2));
        System.out.println(l);
        

        System.out.println(l.contains("Harsh"));
    }
}
