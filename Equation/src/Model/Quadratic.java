
package Model;

import java.util.ArrayList;
import java.util.List;

public class Quadratic extends Function{

    public Quadratic(Double a, Double b, Double c) {
        super(a, b, c);
    }
    
    public List<Double> calculateQuadraticEquation(){
        List<Double> q = new ArrayList<>();
        Double delta = b * b - 4 * a * c;

        if (a == 0) {
            if (b == 0 && c != 0){
            q = null;
        } else if (b != 0){
            s1 = -c/b;
            q.add(s1);
        }
        return q;
        }

        if (delta < 0) {
            return null;
        } else if (delta == 0) {
            s1 = -b / (2 * a);
            s2 = s1;
            q.add(s1);
            q.add(s2);
        } else {
            s1= (-b + Math.sqrt(delta)) / (2 * a);
            s1= (-b - Math.sqrt(delta)) / (2 * a);
            q.add(s1);
            q.add(s2);
        }
        return q;
    }
}