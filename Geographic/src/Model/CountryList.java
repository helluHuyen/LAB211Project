
package Model;

import java.util.ArrayList;
import java.util.function.Predicate;

public class CountryList extends ArrayList<Country>{
    
    public ArrayList<Country> search(Predicate<Country> p) {
        ArrayList<Country> rs = new ArrayList<>();
        for (Country e:this) if (p.test(e)) rs.add(e);
        return rs;
    }
}