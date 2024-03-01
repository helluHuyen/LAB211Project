package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.File;
import java.nio.file.Path;

public class Controller2 {

    @FXML
    private Label label1, label2, label3, label4, label5;

    public void print(String path) {
        File file = new File(path);
    
        Path filePathObj = file.toPath();
        String disk = filePathObj.getRoot().toString();
        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf('.');
        String extension = "";
        if (lastDotIndex != -1) {
            extension = fileName.substring(lastDotIndex + 1);
            fileName = fileName.substring(0, lastDotIndex);
        }
        String filePath = file.getPath();
        String folder = file.getParent();
    
        label1.setText("Disk: " + disk);
        label2.setText("FileName: " + fileName);
        label3.setText("Extension: " + extension);
        label4.setText("Path: " + filePath);
        label5.setText("Folder: " + folder);
    }
}