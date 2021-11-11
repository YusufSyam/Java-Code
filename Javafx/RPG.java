package id.ysf; //Akan error kalau package tidak diubah

import java.util.Scanner;
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

public class RPG extends Application{
	
	@Override
	public void start(final Stage stage) throws Exception{
		
		stage.setTitle("RPG");
		
		Button signIn= new Button("SIGN IN");
		Button logIn= new Button("LOG IN");
		
		HBox hbox1= new HBox(signIn, logIn);
		StackPane halamanAwal= new StackPane(hbox1);
		Scene sceneHalamanAwal= new Scene(halamanAwal, 655, 645);
		
		signIn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
				try{
                stage.setScene(sceneBikinAkun(sceneHalamanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		stage.setScene(sceneHalamanAwal);
		stage.show();
	}
	
	public static Scene sceneBikinAkun(Scene a, Stage stage){
		VBox vboxBikinAkun= new VBox();
		StackPane paneBikinAkun= new StackPane(vboxBikinAkun);
		Scene sceneBikinAkun= new Scene(paneBikinAkun, 655, 645);
		
		VBox vboxBikinChar= new VBox();
		StackPane paneBikinChar= new StackPane(vboxBikinChar);
		Scene sceneBikinChar= new Scene(paneBikinChar, 655, 645);
		
		Text teksBikinUserName= new Text("USER NAME");
		Text teksBikinPassword= new Text("PASSWORD");
		
		Text spasi1= new Text("\n");
		Text notif= new Text("\n");
		
		notif.setFont(Font.font(11));
		teksBikinUserName.setFont(Font.font(25));
		teksBikinPassword.setFont(Font.font(25));

		notif.setFill(Color.rgb(240,0,0));
		
		TextField TFUserName= new TextField();
		TextField TFPassword= new TextField();
		TextField TFPassword2= new TextField();
		
		TFUserName.setPrefWidth(250);
		TFUserName.setPrefHeight(35);
		
		TFPassword.setPrefWidth(250);
		TFPassword.setPrefHeight(35);
		
		TFPassword2.setPrefWidth(250);
		TFPassword2.setPrefHeight(35);
		
		Button submit= new Button("SET ACCOUNT");
		
		submit.setPrefWidth(300);
		submit.setPrefHeight(100);
		
		HBox hbox1= new HBox(TFUserName);
		HBox hbox2= new HBox(TFPassword);
		HBox hbox3= new HBox(TFPassword2);
		
		VBox vboxBikinUserName= new VBox(teksBikinUserName, hbox1, spasi1);
		VBox vboxBikinPassword= new VBox(teksBikinPassword, hbox2, hbox3, notif);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);
		
		vboxBikinUserName.setAlignment(Pos.CENTER);
		vboxBikinPassword.setAlignment(Pos.CENTER);
		vboxBikinAkun.setAlignment(Pos.CENTER);
		
		vboxBikinUserName.setSpacing(15);
		vboxBikinPassword.setSpacing(15);
		
		vboxBikinAkun.getChildren().addAll(vboxBikinUserName, vboxBikinPassword, submit, spasi1);
		vboxBikinAkun.setSpacing(20);
		
		submit.setOnAction(e->{
			if(!TFPassword.getText().equals(TFPassword2.getText())) notif.setText("Password yang anda masukkan tidak sama\n");
			else{ stage.setScene(sceneBikinChar);
			}
		});
	
		Text teksIGN= new Text("Character Name : ");
		
		TextField isiIGN= new TextField();
		
		Button submitIGN= new Button("SUBMIT");
		
		HBox hbox4= new HBox(teksIGN, isiIGN);
		
		vboxBikinChar.getChildren().addAll(hbox4, submitIGN);
		
		submitIGN.setOnAction(e->{
			Player player= new Player(isiIGN.getText());
			stage.setScene(scenePlay(stage, player));
		});
		//
	//	makeName();
		
		
		
		return sceneBikinAkun;
	}
	
	public static Scene scenePlay(Stage stage, Player player){
		
		VBox vbox1= new VBox();
		StackPane pane= new StackPane(vbox1);
		Scene scenePlay= new Scene(pane, 655, 645);
		
		Button fight= new Button("ATTACK!");
		
		Text desc= new Text(player.desc());
		
		vbox1.getChildren().addAll(fight, desc);
		
		fight.setOnAction(e->{
			player.Exp+= 10;
			desc.setText(player.desc());
			
			if(player.Exp==100){
			player.levelUp();
			player.Exp= 0;
		} 	
		});	
		
		return scenePlay;
	}
	
	static Scanner xx= new Scanner(System.in);
	
	String makeName(){ return xx.nextLine();}
	
	public static void main(String [] args){
		launch();
	}
}

class Account{
	
	
	
	
	
	
	
	
}

class Player{
	
	String userName;
	private int Level;
	private int Str;
	private int Int;
	private int Vit;
	private double Hp;
	private double Mp;
	private double Atk;
	private double Def;
	private double Cspd;
	private double HpRgn;
	private double MpRgn;
	double Exp;
	
	Player(){}

	Player(String name){
		userName= name;
		Level= 1;
		Str= 1;
		Int= 1;
		Vit= 1;
		Hp= 500;
		Mp= 100;
		Atk= 100;
		Def= 51;
		Cspd= 100;
		HpRgn= 10;
		MpRgn= 1;
		Exp= 0;
	}
	
	void levelUp(){
		Level++;
		Hp+= 25;
		Mp+= 5;
		Atk+= 4;
		Def+= 3.5;
		Cspd+= 2;
		HpRgn+= 0.5;
		if(Level%5==0){
			Hp+= 69;
			Mp+= 1;
			Atk+= 3;
			Def+= 0.5;
			MpRgn+= 0.5;
		}
	}
	
	String getName(){return userName;}
	int getLevel(){return Level;}
	int getStr(){return Str;}
	int getInt(){return Int;}
	int getVit(){return Vit;}
	double getHp(){return Hp;}
	double getMp(){return Mp;}
	double getAtk(){return Atk;}
	double getDef(){return Def;}
	double getCspd(){return Cspd;}
	double getHpRgn(){return HpRgn;}
	double getMpRgn(){return MpRgn;}
	double getExp(){return Exp;}
	
	public String desc(){
		return  "Name\t="+userName+
				"\nLevel\t= "+Level+
				"\nStr\t\t= "+Str+
				"\nInt\t\t= "+Int+
				"\nVit\t\t= "+Vit+
				"\nHp\t\t= "+Hp+
				"\nMp\t\t= "+Mp+
				"\nAtk\t\t= "+Atk+
				"\nDef\t\t= "+Def+
				"\nCspd\t= "+Cspd+
				"\nHpRgn\t= "+HpRgn+
				"\nMpRgn\t= "+MpRgn+
				"\nexp\t\t= "+Exp+" %";
	}
}
