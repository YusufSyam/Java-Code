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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public class Kalkulator extends Application{
	
	static Double hasil= 0.0;
	
	@Override
	public void start(Stage stage){
		stage.setTitle("Kalkulator");
		
		VBox vboxAll= new VBox();
		Scene sceneMain= new Scene(vboxAll, 300, 360);
		
		Button tambah= new Button("+");
		Button kurang= new Button("-");
		Button bagi= new Button(":");
		Button kali= new Button("x");
		Button enter= new Button("Enter");
		
		tambah.setFont(Font.font(30));
		kurang.setFont(Font.font(30));
		bagi.setFont(Font.font(30));
		kali.setFont(Font.font(30));
		
		tambah.setPrefWidth(135);
		kurang.setPrefWidth(135);
		bagi.setPrefWidth(135);
		kali.setPrefWidth(135);
		
		tambah.setPrefHeight(50);
		kurang.setPrefHeight(50);
		bagi.setPrefHeight(50);
		kali.setPrefHeight(50);
		
		TextField isi= new TextField();
		
		HBox hbox0= new HBox(isi, enter);
		HBox hbox1= new HBox(tambah, kurang);
		HBox hbox2= new HBox(bagi, kali);
		
		hbox0.setSpacing(5);
		hbox1.setSpacing(10);
		hbox2.setSpacing(10);
		hbox0.setAlignment(Pos.CENTER);
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
	
		enter.setOnMouseClicked(e->{
			String hasil2= ""+hasil;
			isi.setText(hasil2);
		});
		
		tambah.setOnMouseClicked(e->{
			Double tambahIsi= Double.parseDouble(isi.getText());
			hasil+= tambahIsi;
			String hasil2= ""+hasil;
			isi.setText(hasil2);
		});
		
		kurang.setOnMouseClicked(e->{
			Double kurangIsi= Double.parseDouble(isi.getText());
			hasil-= kurangIsi;
			String hasil2= ""+hasil;
			isi.setText(hasil2);
		});
		
		bagi.setOnMouseClicked(e->{
			Double bagiIsi= Double.parseDouble(isi.getText());
			hasil/= bagiIsi;
			String hasil2= ""+hasil;
			isi.setText(hasil2);
		});
		
		kali.setOnMouseClicked(e->{
			Double kaliIsi= Double.parseDouble(isi.getText());
			hasil*= kaliIsi;
			String hasil2= ""+hasil;
			isi.setText(hasil2);
		});
		
		vboxAll.getChildren().addAll(hbox0, hbox1, hbox2);
		vboxAll.setSpacing(10);
		vboxAll.setAlignment(Pos.CENTER);
		
		stage.setScene(sceneMain);
		stage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
}