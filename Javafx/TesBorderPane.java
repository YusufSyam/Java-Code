package id.ysf;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.Group;

public class TesBorderPane extends Application{
	
	@Override
	public void start(Stage stage){
	//	Group group= new Group();
		//Scene firstScene= new Scene(group, /*lebar*/ 900, /*panjang*/ 620);
		
		BorderPane bp1= new BorderPane();
		
		BorderPane bPane = new BorderPane();   
       
		//Setting the top, bottom, center, right and left nodes to the pane 
		bPane.setTop(new TextField("Top")); 
		bPane.setBottom(new TextField("Bottom")); 
		bPane.setLeft(new TextField("Left")); 
		bPane.setRight(new TextField("Right")); 
		bPane.setCenter(new TextField("Center")); 
      
		//Setting title to the Stage
		stage.setTitle("BorderPane Example"); 
		
		Scene firstScene= new Scene(bPane);
		//Isi
	
		stage.setScene(firstScene);
		stage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
	
}