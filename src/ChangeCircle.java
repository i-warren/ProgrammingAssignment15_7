import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * ChangeCircle utilizes JavaFX to draw a circle.
 * On mouse press the circle's fill is set to black.
 * On release, its fill is set to white.
 */

public class ChangeCircle extends Application {
    @Override   // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a pane
        Pane pane = new Pane();
        pane.setCenterShape(true);

        // Create a circle with a fill of WHITE and stroke of GRAY
        Circle circle = new Circle(250, 250, 150);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.GRAY);

        // set circle properties on mouse press and release
        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK));
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE));

        // add circle to pane
        pane.getChildren().add(circle);

        // create a scene and place it in the stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Circle Color Change");   // Set Title
        primaryStage.setScene(scene);                   // Place scene in Stage
        primaryStage.show();                            // Display Stage


    }

    public static void main(String[] args) {
        launch();
    }
}