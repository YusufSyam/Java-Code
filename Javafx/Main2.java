package id.ysf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class Main2 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();

        StackPane holder = new StackPane();
        Canvas canvas = new Canvas(400,  300);

        holder.getChildren().add(canvas);
        root.getChildren().add(holder);

        holder.setStyle("-fx-background-color: red");
		holder.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}