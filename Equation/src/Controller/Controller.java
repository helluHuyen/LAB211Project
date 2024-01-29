package Controller;

import Common.Library;
import Model.Quadratic;
import Model.Superlative;
import View.Display;
import View.Menu;

public class Controller extends Menu<String> {

    protected static Menu<String> parentMenu;
    private static String[] mc = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    private Library lib;
    private Display dis;
    public Controller(Menu<String> parentMenu) {
        super("========= Equation Program =========", mc, parentMenu);
        this.parentMenu = parentMenu;
        lib = new Library();
        dis = new Display();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                calculateEquation();
                break;
            case 2:
                calculateQuadraticEquation();
                break;
            case 3:
                System.exit(0);

        }
    }

    public void calculateEquation(){
        Double a = lib.getDouble("Enter A:");
        Double b = lib.getDouble("Enter A:");
        Superlative s = new Superlative(a, b);
        dis.displaySolution(s.calculateEquation());
        dis.displayList(s.checkOdd(), "Odd numbers");
        dis.displayList(s.checkEven(), "Even numbers");
        dis.displayList(s.checkPerfectSquare(), "Perfect Square numbers");
    }
    
    public void calculateQuadraticEquation(){
        Double a = lib.getDouble("Enter A");
        Double b = lib.getDouble("Enter B");
        Double c = lib.getDouble("Enter C");
        Quadratic q = new Quadratic(a, b, c);
        dis.displaySolution(q.calculateQuadraticEquation());
        dis.displayList(q.checkOdd(), "Odd numbers");
        dis.displayList(q.checkEven(), "Even numbers");
        dis.displayList(q.checkPerfectSquare(), "Perfect Square numbers");
    }
}