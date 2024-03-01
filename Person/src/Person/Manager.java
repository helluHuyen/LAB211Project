
package Person;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Manager {
    private final Scanner sc = new Scanner(System.in);
    
    public int getInt(String mess){
        while(true){
            try{
                String result = getString(mess);
                int choice;
                if (checkInteger(result )){
                    choice = Integer.parseInt(result );
                    return choice;
               
            } else {
                    throw new NumberFormatException();
                    }
        } catch (NumberFormatException ex){
                System.out.println("Error! Enter again!");
                }
    }
}
    public boolean checkInteger(String str){
        Pattern pattern =Pattern.compile("\\d*");
        Matcher matcher = pattern.matcher(str);
        if(matcher.matches()){
            return true;
        } else {
            return false;
        }
    }
    public double getDouble(String mess){
        while(true){
            System.out.println("Please input salary:");
            String str = sc.nextLine();
            if (checkInteger(str)){
                return Double.parseDouble(str);
            } else {
                System.out.println("You must input digidt.");
            }
        }
    }
    public String getString (String mess){
         System.out.println(mess);
         return sc.nextLine().trim();
    }
    public Person[] inputPersonInfo (){
        Person[] p = new Person[3];
        System.out.println("=====Management Person programer=====");
        for(int i=0; i<p.length;i++){
            System.out.println("Input Information of Person");
            String name = getString("Please input name: ");
            String address = getString("Please input address: ");
            double salary = getDouble("Please input salary: " );
            p[i] = new Person(name,address,salary);
        }
        return p;
    }
    public Person[] sortBySalary(Person[] persons){
        Person pt;
        for (int i = 0; i<persons.length; i++){
            for (int j=i+1; j<persons.length;j++){
            if(persons[i].getSalary()>persons[j].getSalary()){
                pt=persons[i];
                persons[i]=persons[j];
                persons[j]=pt;
            }
            
        }
    }
        return persons;
}
    public void displayPerson(Person[]p){
        for (Person p1 : p) {
            System.out.println(p1.toString());
        }
    }
}