import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setCenterShape(true);

        Circle circle = new Circle(250, 250, 150);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.GRAY);

        circle.setOnMousePressed(e -> {circle.setFill(Color.BLACK);});
        circle.setOnMouseReleased(e -> { circle.setFill(Color.WHITE);});

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Circle Color Change");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}