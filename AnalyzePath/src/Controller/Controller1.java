package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller1 {
    @FXML 
    TextField textField;
    @FXML
    Button submit;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void analyze(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Scene2.fxml"));
        root = loader.load();

        Controller2 controller2 = loader.getController();
        controller2.print(getPath());
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public String getPath() {
        return textField.getText();
    }
}
