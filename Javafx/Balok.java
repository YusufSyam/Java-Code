package id.ysf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.util.Scanner;
import javafx.geometry.Pos;
import java.lang.String;
import javafx.scene.control.Label;

public class Balok extends Application{
	
	@Override
	public void start(Stage stage){
		stage.setTitle("Volume Balok");
		
		Label panjang= new Label("Panjang\t: ");
		Label lebar= new Label("Lebar\t: ");
		Label tinggi= new Label("Tinggi\t: ");
		
		TextField isiP= new TextField();
		TextField isiL= new TextField();
		TextField isiT= new TextField();
		TextField isiH= new TextField();
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(panjang, isiP);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(lebar, isiL);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(10);
		hbox3.getChildren().addAll(tinggi, isiT);
		
		Button enter= new Button("Enter");
		Label hasil= new Label();
		
		enter.setOnMouseClicked(e->{

			int angka1= Integer.parseInt(isiP.getText());
			int angka2= Integer.parseInt(isiL.getText());
			int angka3= Integer.parseInt(isiT.getText());
			String hasil2= "Volume Balok : "+(angka1*angka2*angka3);
			hasil.setText(hasil2);
			
		});
		
		VBox vbox1= new VBox(hbox1, hbox2, hbox3);
		VBox vbox2= new VBox(enter, hasil);
		vbox2.setSpacing(10);
		VBox vbox3= new VBox(vbox1, vbox2);
		vbox3.setSpacing(5);
		
		
		Scene aplikasi= new Scene(vbox3, 800, 600);
		stage.setScene(aplikasi);
		stage.show();
		
	}
	public static void main(String [] args){
		launch();
	}
}