package CollectionConcept.Set.ComparatorDemo;

import java.util.Comparator;

public class NameComparator_3 implements Comparator<ComparableDemo_1> {

    @Override
    public int compare(ComparableDemo_1 o1, ComparableDemo_1 o2) {
        return o1.name.compareTo(o2.name);

    }
}
