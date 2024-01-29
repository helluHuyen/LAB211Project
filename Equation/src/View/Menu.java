package View;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Menu<T> {
    protected String title;
    protected ArrayList<T> mChon;
    protected Menu parentMenu;
    
    public Menu(){}
    
    public Menu(String td, String[] mc, Menu parentMenu){
        title=td;
        this.mChon= new ArrayList<>();
        this.parentMenu = parentMenu;
        for(String s:mc) mChon.add((T) s);
    }
//-------------------------------------------
    public void display(){
        System.out.println(title);
        System.out.println("--------------------------------");
        for(int i=0; i<mChon.size();i++)
            System.out.println((i+1)+"."+mChon.get(i));
        System.out.println("--------------------------------");
    }
//-------------------------------------------
    public void returnToPMenu(){
        if (parentMenu != null){
            parentMenu.run();
        }
    }
//-------------------------------------------
    public int getSelected(){
        display();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your choice:");
        return sc.nextInt();
    }
//-------------------------------------------
    public abstract void execute(int n);
//-------------------------------------------
    public void run(){
        while(true){
            int n=getSelected();
            execute(n);
            if(n>mChon.size()) break;
        }
    }
//-------------------------------------------    
   public static String getString(String msg) {
        System.out.println(msg);
        return new Scanner(System.in).nextLine();
    }
}