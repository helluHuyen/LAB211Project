
package Common;

import java.util.Scanner;


public class Validation {
    private  Scanner sc =new Scanner (System.in);
    public  int inputChoice (int min, int max){
        Scanner sc = new Scanner (System.in);
        int ans;
        while (true){
            try{
                ans = Integer.parseInt(sc.nextLine());
                if (ans < min || ans > max){
                    throw new ArithmeticException ("Not valid. Enter a valid number from "+min+"to"+ max);
                }
                break;
              } catch (NumberFormatException e){
                  System.out.println("Please input a valid number.");
              } catch (ArithmeticException ex){
                  System.err.println(ex.getMessage());
            }
        }
        return ans;
    }
    public  double inputDouble(){
        double db;
        while (true){
            try{
                db= Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e){
                System.out.println("Please input a valid number.");
            }
        }
        return db;
    }
    public String inputOp(){
        String op;
        while (true){
            try{
                op = sc.nextLine().trim();
                if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("^") && !op.equals("=")){
                    throw new ArithmeticException ("Invalid operator.");
                }
            break;
        }catch (ArithmeticException e){
            System.err.println(e.getMessage());
        }
        }
        return op;
    }
    public double inputWeight() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                if(db<=0 || db > 400){
                    throw new ArithmeticException("Invalid weight. Please enter a double number bigger than 0 and no more than 300.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Weight is a digit.");
            } catch (ArithmeticException ex){
                System.err.println(ex.getMessage());
                System.out.println("Enter weight again (kg) :");
            }
        }
        return db;
    }
    
    public double inputHeight() {
        double db;
        while (true) {
            try {
                db = Double.parseDouble(sc.nextLine());
                if(db<=0 || db > 3){
                    throw new ArithmeticException("Invalid weight. Please enter a double number bigger than 0 and no more than 3.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Height is a digit.");
            } catch (ArithmeticException ex){
                System.err.println(ex.getMessage());
                System.out.println("Enter height again (meter) :");
            }
        }
        return db;
    }
}
