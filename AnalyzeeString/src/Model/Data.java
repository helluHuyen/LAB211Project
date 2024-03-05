package Model;

import java.util.ArrayList;
import java.util.List;



public class Data {
    private String input;
    private String allChar;
    private List<Integer> numberList = new ArrayList<>();
    private String upperChar;
    private String lowerChar;
    private String specialChar;
    private List<Integer> oddList = new ArrayList<>();
    private List<Integer> evenList = new ArrayList<>();
    private List<Integer> squareList = new ArrayList<>();

    public Data(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getAllChar() {
        return allChar;
    }

    public void setAllChar(String allChar) {
        this.allChar = allChar;
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String getUpperChar() {
        return upperChar;
    }

    public void setUpperChar(String upperChar) {
        this.upperChar = upperChar;
    }

    public String getLowerChar() {
        return lowerChar;
    }

    public void setLowerChar(String lowerChar) {
        this.lowerChar = lowerChar;
    }

    public String getSpecialChar() {
        return specialChar;
    }

    public void setSpecialChar(String specialChar) {
        this.specialChar = specialChar;
    }

    public List<Integer> getOddList() {
        return oddList;
    }

    public void setOddList(List<Integer> oddList) {
        this.oddList = oddList;
    }

    public List<Integer> getEvenList() {
        return evenList;
    }

    public void setEvenList(List<Integer> evenList) {
        this.evenList = evenList;
    }

    public List<Integer> getSquareList() {
        return squareList;
    }

    public void setSquareList(List<Integer> squareList) {
        this.squareList = squareList;
    }
    
    
}
