package CollectionConcept.Map;

import java.util.*;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args){
        TreeMap t = new TreeMap();{
            t.put(1,"Harsh");
            t.put(3,"Soham");
            t.put(4,"Ram");
            t.put(5,"Sachin");
            t.put(2,"Alex");
            System.out.println(t);
            System.out.println(t.keySet());
            System.out.println(t.values());
            Set s = t.keySet();
            System.out.println(s.contains(2));
        }
    }
}
