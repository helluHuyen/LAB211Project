
package Controller;

import Common.Validation;

public class Menu {
    public int chooseInputOption(){
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator.");
        System.out.println("2. BMI Calculator.");
        System.out.println("3. Exit.");
        System.out.println(" Please choice one option: ");
        Validation validation = new Validation();
        int choice = validation.inputChoice(1,3);
        return choice;
    }
}
    

