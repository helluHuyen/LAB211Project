package Controller;

import javafx.scene.paint.Color;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Button submit;
    @FXML
    TextField phoneField, emailField, dateField;
    @FXML
    Label label1, label2, label3;

    public void checkPhone(){
        String phone = phoneField.getText();
        int check = 0;
        @SuppressWarnings("unused")
        int phoneNumber;
        if(phone.length() != 10){
            label1.setTextFill(Color.RED);
            label1.setText("Phone number must be contain 10 digits");
        }
        else {
            try {
                phoneNumber = Integer.parseInt(phone);
            } catch (Exception e) {
                label1.setTextFill(Color.RED);
                label1.setText("Phone number must be contains only number");
                check = 1;
            }
            if(check == 0){
                label1.setTextFill(Color.GREEN);
                label1.setText("Phone number check");
            }
        }
    } 

    public void checkEmail(){

        String email = emailField.getText();
        if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            label2.setTextFill(Color.RED);
            label2.setText("Invalid email format");
        } else {
            label2.setTextFill(Color.GREEN);
            label2.setText("Email format check");
        }
    }

    public void checkDate(){

        String date = dateField.getText();
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            label3.setTextFill(Color.GREEN);
            label3.setText("Date format check");
        } catch (Exception e) {
            label3.setTextFill(Color.RED);
            label3.setText("Invalid date format (dd/MM/yyyy)");
        }
    }

    public void checkAll(ActionEvent event){
        checkPhone();
        checkEmail();
        checkDate();
    }
}
