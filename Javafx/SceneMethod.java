package id.ysf;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;

public class SceneMethod extends Application{
	
	@Override
	public void start (Stage stage){
		VBox vbox1= new VBox();
		Text label2= new Text("Ahha2");
		StackPane pane111= new StackPane(vbox1, label2);
		StackPane.setAlignment(label2, Pos.BOTTOM_CENTER);
		Button tombol= new Button("Pindah scene");
		Scene main= new Scene(pane111, 400, 400);
		
		tombol.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(sceneLain(main, stage));
            }
        });
		
		Label label1= new Label("Ahha");
		
		StackPane pane1= new StackPane(label1);
		
		vbox1.getChildren().addAll(pane1, tombol);
		
		stage.setScene(main);
		stage.show();
		
	}
	
	public static Scene sceneLain(Scene x, Stage stage){
		Button back= new Button("Back");
		Scene scene1= new Scene(back, 400, 400);
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		return scene1;
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }
}