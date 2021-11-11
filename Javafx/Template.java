//package

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

public class Template extends Application{
	
	@Override
	public void start(Stage stage){
		Group group= new Group();
		Scene firstScene= new Scene(group, /*lebar*/ 900, /*panjang*/ 620);
		
		//Isi
	
		stage.setScene(firstScene);
		stage.setTitle("Ini judul");
		stage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
	
}