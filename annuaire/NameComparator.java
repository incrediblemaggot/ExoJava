package td3Collection.annuaire;

import java.util.Comparator;

public class NameComparator implements Comparator<Fiche> {
    @Override
    public int compare(Fiche o1, Fiche o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
