
package model;
import java.util.ArrayList;
import java.util.List;

public class ExpenseModel {
    public List<Expense> expenses;

    public ExpenseModel() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public List<Expense> getAllExpenses() {
        return new ArrayList<>(expenses);
    }

    public void deleteExpense(int id) {
        expenses.removeIf(expense -> expense.getId() == id);
    }
}

