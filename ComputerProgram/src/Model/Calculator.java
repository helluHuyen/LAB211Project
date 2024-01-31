
package Model;

public abstract class Calculator {
    protected double n1;
    protected double n2;
    protected double ans;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getAns() {
        return ans;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }
    public abstract double calAns();
    
}
