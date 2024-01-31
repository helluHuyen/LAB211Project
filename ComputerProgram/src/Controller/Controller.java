
package Controller;

import Common.Validation;
import Model.BMICalculator;
import Model.NormalCalculator;

public class Controller {

    public void main(String[] args) {
        int choice;
        Menu menu = new Menu();
        while (true) {
             choice = menu.chooseInputOption();
            switch (choice) {
                case 1 -> {
                    calNormal();
                }
                case 2 -> {
                    calBMI();
                }
                case 3 ->
                    System.exit(0);
            }
        }
    }

    public void calBMI() {
        Validation validation = new Validation();
        System.out.print("Enter Weight: ");
        double n1 = validation.inputWeight();
        System.out.print("Enter Height: ");
        double n2 = validation.inputHeight();
        BMICalculator bmi = new BMICalculator(n1, n2);
        double ans;
        try {
            ans = bmi.calAns();
        } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
            return;
        }
        System.out.println("BMI number: " + ans);
        System.out.println("BMI status: " + bmi.setStatus().toUpperCase());

    }

    public void calNormal() {
        
        Validation validation = new Validation();
        String op = " ";
        System.out.print("Enter number: ");
        double n1 = validation.inputDouble();
        double ans = n1;
        do {
            n1 = ans;
            System.out.print("Enter operator: ");
            op = validation.inputOp();
            if(op.equals("=")){
                break;
            }
            System.out.print("Enter number: ");
            double n2 = validation.inputDouble();
            NormalCalculator nc = new NormalCalculator(n1, n2, op);
            try {
                ans = nc.calAns();
                System.out.println("Memory: " + ans);
            } catch (ArithmeticException e) {
                System.err.println(e.getMessage());
                return;
            }
        } while (!op.equals("="));
        System.out.println("Result: " + ans);
    }
}