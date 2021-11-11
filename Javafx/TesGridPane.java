package id.ysf;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Insets; 
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TesGridPane extends Application{
	
	@Override
	public void start(Stage stage){
		GridPane gp= new GridPane();
		Scene firstScene= new Scene(gp,600, 450);
		
		Text userName= new Text("User name : ");
		Text password= new Text("Password   : ");
		
		TextField tf1= new TextField();
		TextField tf2= new TextField();
		
		Button submit= new Button("Submit");
		Button clear= new Button("Clear");
		
		//clear.setPrefSize(300,100);
		
		//add children dan urutan tempat (x,y)
		gp.add(userName, 0, 0);
		gp.add(password, 0, 1);
		gp.add(tf1, 1, 0);
		gp.add(tf2, 1, 1);
		gp.add(clear, 0, 2);
		gp.add(submit, 1, 2);
		
		//set gap/spasi antara children
		gp.setVgap(5); 
		gp.setHgap(5);
		
		//set spasi (new insets(y, x, y dari bawah, x dari kanan))
		//gp.setPadding(new Insets(100, 100, 100, 100)); 
		
		//set Alignment
		gp.setAlignment(Pos.CENTER);
		
		//set size dari gridPane, sehingga size scene tak perlu diatur
		//gp.setMinSize(400, 200); 
	
		stage.setScene(firstScene);
		stage.setTitle("Belajar Grid Pane");
		stage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
	
}