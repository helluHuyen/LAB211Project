package Model;

public class NormalCalculator extends Calculator {

    private String op;

    /* public NormalCalculator(){
    
}*/
    public NormalCalculator(double n1, double n2, String op) {
        super(n1, n2);
        this.op = op;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public double calAns() throws ArithmeticException {
        switch (op) {
            case "+" -> {
                ans = n1 + n2;
            }
            case "-" -> {
                ans = n1 - n2;
            }
            case "*" -> {
                ans = n1 * n2;
            }
            case "/" -> {
                ans = n1 / n2;
                if (n2 == 0) {
                    throw new ArithmeticException("Can not divide for 0");
                }
            }
            case "^" -> {
                ans = Math.pow(n1, n2);
            }
        }
        return ans;
    }
}
