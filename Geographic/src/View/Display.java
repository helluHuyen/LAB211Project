
    
package View;

import Model.Country;
import java.util.ArrayList;

public class Display {
    
    public void printRecent(ArrayList<Country> sl) {
        if (sl.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            Country last = sl.get(sl.size() - 1);
            System.out.println("Most Recently Added Country:");
            System.out.printf("%-10s%-15s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
            System.out.printf("%-10s%-15s%-15s%-10s\n", last.getCode(), last.getName(), last.getArea(), last.getTerrain());
        }
    }
    
    public void printAll(ArrayList<Country> cl) {
        int total = 0;
        if (cl.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("All Countries:");
            for (Country c : cl) {
                total++;
                System.out.printf("%-10s%-15s%-15s%-10s\n", "ID", "Name", "Total Area", "Terrain");
                System.out.printf("%-10s%-15s%-15s%-10s\n", c.getCode(), c.getName(), c.getArea(), c.getTerrain());
            }
            System.out.println("Total: " + total);
        }
    }
    
}
