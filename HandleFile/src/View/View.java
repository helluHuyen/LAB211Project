package View;

import java.util.Scanner;

public class View {
    private final Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Find person info.");
        System.out.println("2. Copy Text to new file.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine().trim());
    }
public Scanner getScanner() {
        return scanner;
    }
    public String inputPathFile() {
        System.out.print("Enter path file: ");
        return scanner.nextLine().trim();
    }

    public double inputMoney() {
        System.out.print("Enter money: ");
        return Double.parseDouble(scanner.nextLine().trim());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
