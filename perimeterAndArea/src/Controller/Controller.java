package Controller;

import Model.Circle;
import Model.Triangle;
import Model.Rectangle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField length, width, radius, a, b, c;

    @FXML
    private Label label1, label2, label3;

    @FXML
    private Button button;

    @FXML
    private void calculate() {

        double lengthValue = Double.parseDouble(length.getText());
        double widthValue = Double.parseDouble(width.getText());
        double radiusValue = Double.parseDouble(radius.getText());
        double aValue = Double.parseDouble(a.getText());
        double bValue = Double.parseDouble(b.getText());
        double cValue = Double.parseDouble(c.getText());

        Rectangle rectangle = new Rectangle(widthValue, lengthValue);
        Circle circle = new Circle(radiusValue);
        Triangle triangle = new Triangle(aValue, bValue, cValue);

        double rectanglePerimeter = rectangle.getPerimeter();
        double rectangleArea = rectangle.getArea();

        double circlePerimeter = circle.getPerimeter();
        double circleArea = circle.getArea();

        double triangleArea = triangle.getArea(); 

        label1.setText("Rectangle - Perimeter: " + rectanglePerimeter + ", Area: " + rectangleArea);
        label2.setText("Circle - Perimeter: " + circlePerimeter + ", Area: " + circleArea);
        label3.setText("Triangle - Area: " + triangleArea);
    }
}
