package id.ysf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.util.Scanner;
import javafx.geometry.Pos;
import java.lang.String;
import javafx.scene.control.Label;

public class Perkalian extends Application{
	
	@Override
	public void start(Stage stage){
		stage.setTitle("Perkalian");
		TextField input1= new TextField();
		input1.maxWidth(25);
		TextField input2= new TextField();
		input2.maxWidth(25);
		TextField input3= new TextField();
		Button enter= new Button("Enter");
		Label samaDengan= new Label();
		enter.setOnMouseClicked(e->{

			int angka1= Integer.parseInt(input1.getText());
			int angka2= Integer.parseInt(input2.getText());
			int angka3= angka1*angka2;
			String hasil2= "hasil : "+angka3;
			samaDengan.setText(hasil2);
			
		});
		
		VBox kotak1= new VBox();
		VBox kotak2= new VBox();
		VBox kotak3= new VBox();
		VBox kotak4= new VBox();
		VBox kotak5= new VBox();
		
		kotak1.getChildren().add(input1);
		kotak2.getChildren().add(input2);
		kotak3.getChildren().add(enter);
		kotak5.getChildren().addAll(kotak1, kotak2, kotak3, samaDengan);
		
		Scene aplikasi= new Scene(kotak5, 800, 600);
		stage.setScene(aplikasi);
		stage.show();
		
	}
	
	public static void main(String [] args){
		launch();
	}
}