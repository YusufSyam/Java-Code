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

public class TicTacToe extends Application{
	
	static int x= 0;
	static boolean bool1= false, x1= true;
	static boolean bool2= false, x2= true;
	static boolean bool3= false, x3= true;
	static boolean bool4= false, x4= true;
	static boolean bool5= false, x5= true;
	static boolean bool6= false, x6= true;
	static boolean bool7= false, x7= true;
	static boolean bool8= false, x8= true;
	static boolean bool9= false, x9= true;
	
	@Override
	public void start(final Stage stage) throws Exception{
	
	stage.setTitle("Tic Tac Toe");
	StackPane paneUtama= new StackPane();
	Group group= new Group();
	Scene scene= new Scene(paneUtama, 675, 700);
	
	Button tombol1= new Button();
	Button tombol2= new Button();
	Button tombol3= new Button();
	Button tombol4= new Button();
	Button tombol5= new Button();
	Button tombol6= new Button();
	Button tombol7= new Button();
	Button tombol8= new Button();
	Button tombol9= new Button();	
	Button replay= new Button("Ulang");
	Button menu= new Button("<==");
	
	tombol1.setFont(Font.font("Calibri (body)",100));
	tombol2.setFont(Font.font("Calibri (body)",100));
	tombol3.setFont(Font.font("Calibri (body)",100));
	tombol4.setFont(Font.font("Calibri (body)",100));
	tombol5.setFont(Font.font("Calibri (body)",100));
	tombol6.setFont(Font.font("Calibri (body)",100));
	tombol7.setFont(Font.font("Calibri (body)",100));
	tombol8.setFont(Font.font("Calibri (body)",100));
	tombol9.setFont(Font.font("Calibri (body)",100));
	
	tombol1.setPrefWidth(220);
	tombol2.setPrefWidth(220);
	tombol3.setPrefWidth(220);
	tombol4.setPrefWidth(220);
	tombol5.setPrefWidth(220);
	tombol6.setPrefWidth(220);
	tombol7.setPrefWidth(220);
	tombol8.setPrefWidth(220);
	tombol9.setPrefWidth(220);
	replay.setPrefWidth(50);
	menu.setPrefWidth(50);
	
	tombol1.setPrefHeight(150);
	tombol2.setPrefHeight(150);
	tombol3.setPrefHeight(150);
	tombol4.setPrefHeight(150);
	tombol5.setPrefHeight(150);
	tombol6.setPrefHeight(150);
	tombol7.setPrefHeight(150);
	tombol8.setPrefHeight(150);
	tombol9.setPrefHeight(150);
	replay.setPrefHeight(40);
	menu.setPrefHeight(40);
	
	Rectangle rect= new Rectangle(0, 45, 675, 700); //655
	rect.setFill(Color.rgb(0,0,0));
	
	tombol1.setOnAction(e->{
		if(bool1==true) return;
		if(x%2==0)tombol1.setText("X");
		else{
			tombol1.setText("O");
			x1= false;
		}
		
		x++;
		bool1= true;
	});
	
	tombol2.setOnAction(e->{
		if(bool2==true) return;
		if(x%2==0)tombol2.setText("X");
		else{
			tombol2.setText("O");
			x2= false;
		}
		
		x++;		
		bool2= true;
	});
	
	tombol3.setOnAction(e->{
		if(bool3==true) return;
		if(x%2==0)tombol3.setText("X");
		else{
			tombol3.setText("O");
			x3= false;
		}
		
		x++;	
		bool3= true;
	});
	
	tombol4.setOnAction(e->{
		if(bool4==true) return;
		if(x%2==0)tombol4.setText("X");
		else{
			tombol4.setText("O");
			x4= false;
		}
		
		x++;	
		bool4= true;
	});
	
	tombol5.setOnAction(e->{
		if(bool5==true) return;
		if(x%2==0)tombol5.setText("X");
		else{
			tombol5.setText("O");
			x5= false;
		}
		
		x++;
		bool5= true;
	});
	
	tombol6.setOnAction(e->{
		if(bool6==true) return;
		if(x%2==0)tombol6.setText("X");
		else{
			tombol6.setText("O");
			x6= false;
		}
		
		x++;
		bool6= true;
	});
	
	tombol7.setOnAction(e->{
		if(bool7==true) return;
		if(x%2==0)tombol7.setText("X");
		else{
			tombol7.setText("O");
			x7= false;
		}
		
		x++;
		bool7= true;
	});
	
	tombol8.setOnAction(e->{
		if(bool8==true) return;
		if(x%2==0)tombol8.setText("X");
		else{
			tombol8.setText("O");
			x8= false;
		}
		
		x++;
		bool8= true;
	});
	
	tombol9.setOnAction(e->{
		if(bool9==true) return;
		if(x%2==0)tombol9.setText("X");
		else{
			tombol9.setText("O");
			x9= false;
		}
		x++;
		bool9= true;
	});
	
	HBox hbox0= new HBox(menu, replay);
	HBox hbox1= new HBox(tombol1, tombol2, tombol3);
	HBox hbox2= new HBox(tombol4, tombol5, tombol6);
	HBox hbox3= new HBox(tombol7, tombol8, tombol9);
	
	hbox0.setAlignment(Pos.CENTER);
	hbox1.setAlignment(Pos.CENTER);
	hbox2.setAlignment(Pos.CENTER);
	hbox3.setAlignment(Pos.CENTER);
	
	hbox0.setSpacing(565);
	hbox1.setSpacing(2.5);
	hbox2.setSpacing(2.5);
	hbox3.setSpacing(2.5);
	
	VBox vbox= new VBox(hbox0, hbox1, hbox2, hbox3);
	vbox.setSpacing(2.5);
	vbox.setAlignment(Pos.CENTER);
	
	group.getChildren().add(rect);
	paneUtama.getChildren().addAll(rect, vbox);
	
	stage.setScene(scene);
	stage.show();
	
	}
	public static void main(String [] args){
		launch();
	}
	
}