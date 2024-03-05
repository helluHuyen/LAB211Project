package Controller;

import Model.Data;
import View.UserView;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(UserView.getUserInput());
        Controller.setData(data);
        UserView.displayResult(data);
    }
    
    
}
