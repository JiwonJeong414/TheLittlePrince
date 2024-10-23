package celestialInterface;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

import javafx.application.Application;
import javafx.stage.Stage;

public class celestial extends Application {

    public void start(Stage primaryStage) {
        // Create a button
        Button button = new Button("Click Me!");

        // Set an action when the button is clicked
        button.setOnAction(event -> {
            System.out.println("Button clicked!");
        });

        // Create a layout and add the button
        StackPane root = new StackPane();
        root.getChildren().add(button);

        // Create a scene with the layout
        Scene scene = new Scene(root, 300, 200);

        // Set the title and scene for the primary stage
        primaryStage.setTitle("JavaFX Interface");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launches the JavaFX application
    }
}
