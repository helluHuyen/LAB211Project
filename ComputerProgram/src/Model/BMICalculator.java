
package Model;

public class BMICalculator extends Calculator {

    private String status;
   //public BMICalculator(){  }

    public BMICalculator(double n1, double n2) {
        super(n1, n2);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double calAns() throws ArithmeticException {
       ans = n1/(n2*n2);
       if (n2 == 0){
            throw new ArithmeticException("Can not divide for 0");
       }
       return ans;
    }
public String setStatus(){
    if(ans > 40){
        status = "Very fat - should lose weight immediately";
    }
    if (ans<=40 && ans > 30){
        status = "Fat - should lose weight ";
    }
    if (ans <=30 && ans >25){
        status = "Overweight";
    }
    if (ans <= 25 && ans > 19){
        status = "Standard";
    }
    if (ans <= 19){
    status = "Under-standard";
}
return status;
    }
}

