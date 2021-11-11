package id.ysf;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import java.util.Scanner;
import javafx.geometry.Pos;
import java.util.ArrayList;

public class Test extends Application{
	
	static int tindis1= 0;
	static int tindis2= 0;
	static int tindis3= 0;
	static Scanner xx= new Scanner(System.in);
	
	@Override
	public void start(Stage stage) {
		stage.setTitle("Tes");
		
		Button tombol1= new Button("Ya");
		Button tombol2= new Button("Tidak!");
		Button tombol3= new Button("End");
		VBox kotak1= new VBox();
		VBox kotak2= new VBox();
		VBox kotak3= new VBox();
		TextField input= new TextField();
		
		
		tombol1.setOnMouseClicked(e->{
			tekan1(tombol1, kotak1);
		});
		
		tombol2.setOnMouseClicked(e->{
			tekan2(tombol2, kotak1);
		});
		
		tombol3.setOnMouseClicked(e->{
			tekan3(tombol3, kotak1);
		});
		
		kotak1.getChildren().add(tombol1);
		kotak1.getChildren().add(tombol2);
		kotak1.getChildren().add(tombol3);
		kotak2.getChildren().add(input);
		kotak2.setAlignment(Pos.CENTER);
		kotak3.getChildren().addAll(kotak1, kotak2);
		
		Scene aplikasi= new Scene(kotak3, 800, 600);
		stage.setScene(aplikasi);
		stage.show();
		
	}
	
	public static void tekan1(Button tombol1, VBox kotak1){
		tombol1.setText("Kamu menindis 'ya'!"+tindis1+" kali");
		tindis1++;
	}
	
	public static void tekan2(Button tombol2, VBox kotak1){
		tombol2.setText("Kamu menindis 'tidak'! "+tindis2+" kali");
		tindis2++;
	}
	
	public static void tekan3(Button tombol3, VBox kotak1){
		tombol3.setText("Kamu menindis end "+tindis3+" kali");
		tindis3++;
	}
	
	
	
	public static void main(String [] args) {
		launch();
	}

}