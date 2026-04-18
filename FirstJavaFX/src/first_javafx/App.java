package first_javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;

public class App extends Application {
    @Override
    public void start(Stage window) {
        System.out.println("app started");

        Label label = new Label("Click this button: ");
        Button button = new Button("Click me!");
        button.setLayoutY(25);

        Circle circle = new Circle(200, 200, 20);
        Polygon triangle = new Polygon(100, 150, 180, 90, 35, 80);

        Group group = new Group(label, button, circle, triangle);
        Scene scene = new Scene(group, 800, 600);

        window.setScene(scene);
        window.setTitle("JavaFXApp");
        window.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}
