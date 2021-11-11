package id.ysf;

import javafx.scene.control.ComboBox;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.control.ToolBar;
import javafx.scene.Scene;
import javafx.scene.Group;

public class TesCss extends Application{
	
	@Override
	public void start(Stage stage){
		Group group= new Group();
		Scene firstScene= new Scene(group, /*lebar*/ 900, /*panjang*/ 620);
		//firstScene.getStylesheets().add(getClass().getResource("D:/ContohCss1.css").toExternalForm());
		firstScene.getStylesheets().add("ContohCss1.css");
		
		ComboBox comboBox1= new ComboBox();
		ComboBox comboBox2= new ComboBox();
		ComboBox comboBox3= new ComboBox();
		ComboBox comboBox4= new ComboBox();
		
		//Menyetel nama default
		comboBox1.setPromptText("Choose choices");
		
		comboBox1.getItems().add("Choice 1");
        comboBox2.getItems().add("Choice 2");
        comboBox3.getItems().add("Choice 3");
		comboBox4.getItems().add("Choice 4");
		
		//Membuat combobox editable
		//comboBox.setEditable(true);
		
		ToolBar toolbar1= new ToolBar();
		toolbar1.getItems().addAll(comboBox1, comboBox2, comboBox3, comboBox4);
		
		group.getChildren().addAll(toolbar1);
		
		stage.setScene(firstScene);
		stage.setTitle("Combo Box dengan Tool Bar");
		stage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
	
}