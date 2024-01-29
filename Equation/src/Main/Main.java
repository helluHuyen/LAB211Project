package Main;

import Controller.Controller;
import View.Menu;


public class Main {
    public static void main(String[] args) {
        Menu<String> mainMenu = new Controller(null);
        new Controller(mainMenu).run();
    }
}