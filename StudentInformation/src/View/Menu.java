package View;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu<T> {

    private String title;
    private ArrayList<T> choices;

    public Menu(String title, String[] arr) {
        this.title = title;
        choices = new ArrayList<>();
        for (String s : arr) {
            choices.add((T) s);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("------------------");
        for (int i = 0; i < choices.size(); i++) {
            System.out.println((i + 1) + "." + choices.get(i));
        }
        System.out.println("------------------");
    }

    public int getSelect() {
        Scanner scanner = new Scanner(System.in);
        display();
        return scanner.nextInt();
    }

    public abstract void execute(int n);

    public void run() {
        while (true) {
            int n = getSelect();
            execute(n);
            if (n > choices.size()) {
                break;
            }
        }
    }
}
