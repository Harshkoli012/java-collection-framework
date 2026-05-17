package CollectionConcept.List;

import java.util.LinkedList;

public class LinkedListConcept {
    public static void main (String a[]){
        LinkedList l = new LinkedList();
        l.add("Harsh");
        l.add("Sarthak");
        l.add("Tom");
        l.add(10);;
        l.add(20.89);
        l.add(true);
        l.addFirst("Rishika");
        l.addLast("Alex");
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.removeFirst());
        System.out.println(l.removeLast());
        System.out.println(l);
    }
}
