package CollectionConcept.Set.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest_4 {
    public static void main(String[] args) {
        List<ComparableDemo_1> list = new ArrayList<>();
        list.add(new ComparableDemo_1(1,"Harsh",25));
        list.add(new ComparableDemo_1(2,"Abhi",34));
        list.add(new ComparableDemo_1(3,"Alex",18));
        list.add(new ComparableDemo_1(4,"Adam",27));
        list.add(new ComparableDemo_1(5,"Sachin",31));
        Collections.sort(list,new AgeComparator_2());
        System.out.println("Sorted By age");
        for(ComparableDemo_1 e1:list){
            System.out.println(e1);
        }
        Collections.sort(list,new NameComparator_3());
        System.out.println("Sorted By Name");
        for (ComparableDemo_1 e1:list){
            System.out.println(e1);
        }
    }
}
