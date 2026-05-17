package CollectionConcept.Map;

import java.util.*;

public class MapConcept {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put(1,"Harsh");
        h.put(2,"Ram");
        h.put(null,"Sachin");
        h.put('A',10.2);
        h.put(4,"Harsh");
        System.out.println(h);
        Set s=h.keySet(); //Return only key
        System.out.println("Only key "+s);
        Collection c = h.values(); //Return only values
        System.out.println("Only Values "+c);
          Set s1=h.entrySet(); // Return Key Value pair
           Iterator it = s1.iterator();
           while(it.hasNext()){
               System.out.println(it.next());
           }
        System.out.println(h.get(2));// Return value of particular key
    }
}