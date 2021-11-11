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

public class ButtonText extends Application{
	
	@Override
	public void start(Stage stage){
		stage.setTitle("Belajar Button Text");
		Button a= new Button("1");
		Button b= new Button("2");
		Text c= new Text("AAAA");
		c.setFill(Color.CHOCOLATE);
		Label d= new Label("B");
		TextField e= new TextField();
		Group f= new Group();
		
		HBox hbox1= new HBox(c);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.getChildren().addAll(a, b);
		
		VBox vbox0= new VBox(hbox2);
		vbox0.setAlignment(Pos.BASELINE_CENTER);
		
		VBox vbox1= new VBox();
		vbox1.getChildren().addAll(hbox1, d, vbox0);
		
		Scene aplikasi= new Scene(vbox1, 800, 600);
		stage.setScene(aplikasi);
		stage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
	
}