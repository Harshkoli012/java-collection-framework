package CollectionConcept.Set.ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo_1 implements Comparable<ComparableDemo_1> {

    int id;
    String name;
    int age;

    ComparableDemo_1(int id, String name, int age) {
        this.id = id;
        this.name = name;   // corrected
        this.age = age;
    }

    @Override
    public int compareTo(ComparableDemo_1 o) {
        return this.age - o.age;   // sorting by age
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    public static void main(String[] args) {

        ComparableDemo_1 c = new ComparableDemo_1(1, "Harsh", 30);
        ComparableDemo_1 c1 = new ComparableDemo_1(2, "Alex", 28);
        ComparableDemo_1 c2 = new ComparableDemo_1(3, "Adam", 34);

        List<ComparableDemo_1> l = new ArrayList<>();

        l.add(c);
        l.add(c1);
        l.add(c2);

        Collections.sort(l);

        for (ComparableDemo_1 e : l) {
            System.out.println(e);
        }
    }
}