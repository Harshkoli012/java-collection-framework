package CollectionConcept.List;
import java.util.*;
import java.lang.*;

public  class collection_demo {

    public static void main(String arg[]){
        Vector v = new Vector<>();
        v.add("Ram");
        v.add("Tom");
        v.add("Alex");
        v.add(20);
       LinkedList l = new LinkedList();
       l.add("Harsh");
       l.add("Rishika");
       l.add("ABC");
       l.add(10);
       l.add(10);
       l.add(1,"Sham");
       l.add(10.20);
       l.addAll(v);

        System.out.println(l.isEmpty());
        System.out.println(l.size());
        System.out.println(l.containsAll(v));
        System.out.println(l.remove(1));
        System.out.println(v.get(1));
        System.out.println(l);

    }
}
