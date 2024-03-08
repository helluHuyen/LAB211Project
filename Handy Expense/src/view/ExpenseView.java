
package view;
import model.Expense;
import java.util.List;

public class ExpenseView {
    public void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add an expense");
        System.out.println("2. Display all expenses");
        System.out.println("3. Remove an expense");
        System.out.println("4. Exit");
    }

    public void printExpenses(List<Expense> expenses) {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to display.");
            return;
        }

        System.out.println("ID\tDate\t\tAmount\t\tContent");
        double total = 0;
        for (Expense expense : expenses) {
            System.out.println(expense.getId() + "\t" + expense.getDate() + "\t" +
                    expense.getAmount() + "\t\t" + expense.getContent());
            total += expense.getAmount();
        }
        System.out.println("Total: " + total);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}

