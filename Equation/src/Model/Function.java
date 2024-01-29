
package Model;

import java.util.ArrayList;

public class Function {
    protected Double a,b,c = null;
    protected Double s1,s2 = null;

    public Function(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Function(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public ArrayList<Double> checkOdd() {
        ArrayList<Double> oddNumbers = new ArrayList<>();
        if (a % 2 != 0) oddNumbers.add(a);
        if (b % 2 != 0) oddNumbers.add(b);
        if (c != null) {
            if ((c % 2 != 0)) oddNumbers.add(c);
        }
        if (s1 != null) {
            if ((s1 % 2 != 0)) oddNumbers.add(s1);
        }
        if (s1 != null) {
            if ((s1 % 2 != 0)) oddNumbers.add(s1);
        }
        return oddNumbers;
    }
    
    
    public ArrayList<Double> checkEven() {
        ArrayList<Double> evenNumbers = new ArrayList<>();
        if (a % 2 == 0) evenNumbers.add(a);
        if (b % 2 == 0) evenNumbers.add(b);
        if (c != null) {
            if ((c % 2 == 0)) evenNumbers.add(c);
        }
        if (s1 != null) {
            if ((s1 % 2 == 0)) evenNumbers.add(s1);
        }
        if (s1 != null) {
            if ((s1 % 2 == 0)) evenNumbers.add(s1);
        }
        return evenNumbers;
    }
    
    public ArrayList<Double> checkPerfectSquare(){
        ArrayList<Double> pSquare = new ArrayList<>();
        if (isPerfectSquare(a)) pSquare.add(a);
        if (isPerfectSquare(b)) pSquare.add(b);
        if (c != null) {
            if (isPerfectSquare(c)) pSquare.add(c);
        }
        if (s1 != null && s2 != null){
            if (isPerfectSquare(s1)) pSquare.add(s1);
            if (isPerfectSquare(s2)) pSquare.add(s2);
        }
        return pSquare;
    }
    
    public boolean isPerfectSquare(Double x) {
        int sr = -1;
        if (x >= 0) {
            sr = (int)Math.sqrt(x);
        }
        return (sr * sr) == x;
    }    
}