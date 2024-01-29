
package Model;

import java.util.ArrayList;
import java.util.List;

public class Superlative extends Function{

    public Superlative(Double a, Double b) {
        super(a, b);
    }
    
    public List<Double> calculateEquation (){
        List<Double> s = new ArrayList<>();
        if (a == 0 && b != 0){
            s = null;
        } else if (a != 0){
            s1 = -b/a;
            s.add(s1);
        }
        return s;
    }
}