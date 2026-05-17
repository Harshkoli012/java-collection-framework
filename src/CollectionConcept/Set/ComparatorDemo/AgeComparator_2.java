package CollectionConcept.Set.ComparatorDemo;

import java.util.Comparator;

public class AgeComparator_2 implements Comparator<ComparableDemo_1> {

    @Override
    public int compare(ComparableDemo_1 e1, ComparableDemo_1 e2) {
        if(e1.age>e2.age){
        return 1;
    } else if (e1.age<e2.age) {
            return  -1;

        }
        else {
            return  0;
        }

    }
}
