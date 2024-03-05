package Controller;

import Model.Data;
import java.util.ArrayList;
import java.util.List;



public class Controller {
    public static void setData(Data data){
        String input = data.getInput();
        data.setAllChar(Controller.getAllCharacter(input));
        data.setNumberList(Controller.getListNumber(input));
        List<Integer> number = data.getNumberList();
        data.setEvenList(Controller.findEven(number));
        data.setOddList(Controller.findOdd(number));
        data.setSquareList(Controller.findSquare(number));
        String allChar = data.getAllChar();
        data.setLowerChar(Controller.getLowerCase(allChar));
        data.setUpperChar(Controller.getUpperCase(allChar));
        data.setSpecialChar(Controller.getSpecialChar(allChar));
    }
    
    public static List<Integer> getListNumber(String input){
        List<Integer> numberList = new ArrayList<>();
        String NumString = input.replaceAll("\\D+", " ").trim();//chuyển đổi các kí tự không phải là số thành dấu cách, trim() để loại bỏ dấu cách thừa
        String[] number = NumString.split("\\s+");
        for (String number1 : number) {
            int a = Integer.parseInt(number1);
            numberList.add(a);
        }
        return numberList;
    }
    
    public static String getAllCharacter(String input){
        input = input.replaceAll("\\s+", "");
        String allChar = input.replaceAll("\\d+", "");
        return allChar;
    }
    
    public static String getUpperCase(String all){
        String upper = all.replaceAll("[^A-Z]", "");
        return upper;
    }
    
    public static String getSpecialChar(String all){
        String upper = all.replaceAll("[a-zA-Z0-9]", "");
        return upper;
    }
    
    public static String getLowerCase(String all){
        String lower = all.replaceAll("[^a-z]", "");
        return lower;
    }
    
    public static List<Integer> findOdd(List<Integer> number){
        List <Integer> odd = new ArrayList<>();
        for (Integer n : number){
            if(isOdd(n)){
                odd.add(n);
            }
        }
        return odd;
    }
    
    public static List<Integer> findEven(List<Integer> number){
        List <Integer> even = new ArrayList<>();
        for (Integer n : number){
            if(!isOdd(n)){
                even.add(n);
            }
        }
        return even;
    }
    
    public static List<Integer> findSquare(List<Integer> number){
        List <Integer> square = new ArrayList<>();
        for (Integer n : number){
            if(isSquare(n)){
                square.add(n);
            }
        }
        return square;
    }
    
    public static boolean isOdd(int a){
        return a%2==1;
    }
    public static boolean isSquare(int n){
        int sqrt = (int)Math.sqrt(n);
        return sqrt * sqrt == n;
    }
}
