package CollectionConcept.Map;

import java.util.*;
import java.util.LinkedHashMap;

public class LinkedHashMapConcept {
    public static void main(String[] args) {


    Map h1 = new LinkedHashMap(); //Insertion order preserved
    h1.put(1,"Harsh");
    h1.put(2,"Sachin");
    h1.put(3,"Ram");
    h1.put(4,"Alex");
    h1.put(null,"Abc");
        System.out.println(h1.containsKey(4)); //checks key is present or not
        System.out.println(h1);
        Set s = h1.keySet();
        System.out.println(s.contains(5)); //cheks single object

}}
