
package controller;
import model.Expense;
import model.ExpenseModel;
import view.ExpenseView;
import java.util.Scanner;

public class ExpenseController {
    private ExpenseModel model;
    private ExpenseView view;

    public ExpenseController(ExpenseModel model, ExpenseView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            view.printMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addExpense(scanner);
                case 2 -> view.printExpenses(model.getAllExpenses());
                case 3 -> removeExpense(scanner);
                case 4 -> view.printMessage("Exiting program...");
                default -> view.printMessage("Invalid choice. Please enter again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private void addExpense(Scanner scanner) {
        System.out.print("Enter date (dd-MMM-yyyy): ");
        String date = scanner.next();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter content: ");
        String content = scanner.nextLine();

        Expense expense = new Expense(model.getAllExpenses().size() + 1, date, amount, content);
        model.addExpense(expense);
        view.printMessage("Expense added successfully.");
    }

    private void removeExpense(Scanner scanner) {
        view.printExpenses(model.getAllExpenses());
        System.out.print("Enter ID of the expense to delete: ");
        int idToDelete = scanner.nextInt();

        model.deleteExpense(idToDelete);
        view.printMessage("Expense deleted successfully.");
    }
}
