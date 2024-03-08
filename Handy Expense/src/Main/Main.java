package Main;

import controller.ExpenseController;
import model.ExpenseModel;
import view.ExpenseView;

public class Main {
    public static void main(String[] args) {
        ExpenseModel model = new ExpenseModel();
        ExpenseView view = new ExpenseView();
        ExpenseController controller = new ExpenseController(model, view);

        controller.processUserInput();
    }
}
