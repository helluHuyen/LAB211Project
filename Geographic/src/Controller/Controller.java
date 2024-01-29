package Controller;

import Common.Library;
import Model.Country;
import Model.CountryList;
import View.Display;
import view.Menu;

public class Controller extends Menu<String> {

    private static String[] mc = {"Input the information of 11 countries in East Asia",
        "Display the information of country you've just input",
        "Search the information of country by user-entered name",
        "Display the information of countries sorted name in ascending order",
        "Exit"};
    private Library lib;
    private CountryList cl;
    private Display dp;
    
    public Controller() {
        super("MENU", mc);
        lib = new Library();
        cl = new CountryList();
        dp = new Display();
        cl.add(new Country("VN","Viet Nam", 10000, "Nice"));
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                addCountryInformation();
                break;
            case 2:
                getRecentlyEnteredInformation();
                break;
            case 3:
                searchInformationByName();
                break;
            case 4:
                sortInformationByAscendingOrder();
                break;
            case 5:
                System.exit(0);

        }
    }

    public void addCountryInformation(){
        String choice;
        do {
            String id = lib.getString("Enter code of country: ");
            String name = lib.getString("Enter name of country: ");
            int area = lib.getInt("Enter total area", "Total area must be greater than 0 and is a number");
            String terrain = lib.getString("Enter terrain of country: ");
            cl.add(new Country(id, name, area, terrain));
            choice = lib.getString("Do you want to continue (Y/N)?");
        } while (choice.equalsIgnoreCase("y"));
    }
    
    public void getRecentlyEnteredInformation(){
        dp.printRecent(cl);
    }
    
    public void searchInformationByName(){
        String n = lib.getString("Enter the name you want to search for: ");
        dp.printAll(cl.search(p->p.getName().equalsIgnoreCase(n)));
    }
    
    public void sortInformationByAscendingOrder(){
        dp.printAll(cl);
    }
}