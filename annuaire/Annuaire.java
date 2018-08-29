package td3Collection.annuaire;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Annuaire {

    private Map<String, Fiche> datas = new HashMap<>();

    public Annuaire()   {
    }

    public void add(Fiche fiche)    {
        datas.put(fiche.getName().toLowerCase(), fiche);
    }

    public void add(String name, String number, String address) {
        Fiche f = new Fiche(name, number, address);
        datas.put(name.toLowerCase(), f);
    }

    public void remove(Fiche fiche) {
        datas.remove(fiche.getName().toLowerCase());
    }

    public void removeByName(String name)   {
        datas.remove(name);
    }

    public Fiche findByName(String name) {
        return datas.get(name.toLowerCase());
    }

    public List<Fiche> all()    {
        ArrayList<Fiche> ret = new ArrayList<>();
        ret.addAll(datas.values());
        return ret;
    }

}
