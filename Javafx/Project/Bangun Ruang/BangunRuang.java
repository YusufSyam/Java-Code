//package id.ysf; //Akan error kalau package tidak diubah

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

public class BangunRuang extends Application{
	
	@Override
	public void start(final Stage stage) throws Exception{
		
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg"); //Akan error kalau path tidak diubah
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		group.getChildren().add(imageView);
		
		HBox hbox1= new HBox();
		HBox hbox2= new HBox();
		HBox hbox3= new HBox();
		VBox vbox1= new VBox();
		group.getChildren().add(vbox1);
		
		Scene tampilanAwal= new Scene(group, 655, 645);
		stage.setTitle("VOLUME BANGUN RUANG");
		
		Button balok  = new Button();
		Button kubus  = new Button();
		Button limas  = new Button();
		Button prisma = new Button();
		Button kerucut= new Button();
		Button tabung = new Button();
		Button bola   = new Button();
		
		balok.setPrefWidth(208);
		kubus.setPrefWidth(208);
		limas.setPrefWidth(208);
		prisma.setPrefWidth(208);
		kerucut.setPrefWidth(208);
		tabung.setPrefWidth(208);
		bola.setPrefWidth(208);
		
		balok.setPrefHeight(205);
		kubus.setPrefHeight(205);
		limas.setPrefHeight(205);
		prisma.setPrefHeight(205);
		kerucut.setPrefHeight(205);
		tabung.setPrefHeight(205);
		bola.setPrefHeight(205);
		
		balok.setText("BALOK");
		balok.setFont(Font.font("Times New Roman", 21));
		balok.setStyle("-fx-base: rgb(204,0,0)");
		
		kubus.setText("KUBUS");
		kubus.setFont(Font.font("Times New Roman", 21));
		kubus.setStyle("-fx-base: rgb(250,250,0)");
		
		limas.setText("LIMAS");
		limas.setFont(Font.font("Times New Roman", 21));
		limas.setStyle("-fx-base: rgb(0,250,255)");
		
		prisma.setText("PRISMA");
		prisma.setFont(Font.font("Times New Roman", 21));
		prisma.setStyle("-fx-base: rgb(255,94,0)");
		
		kerucut.setText("KERUCUT");
		kerucut.setFont(Font.font("Times New Roman", 21));    
		kerucut.setStyle("-fx-base: rgb(125,125,125)");	  
		
		tabung.setText("TABUNG");
		tabung.setFont(Font.font("Times New Roman", 21));
		tabung.setStyle("-fx-base: rgb(18,182,0)");
		
		bola.setText("BOLA");
		bola.setFont(Font.font("Times New Roman", 21));
		bola.setStyle("-fx-base: rgb(49,0,182)");
		
		hbox1.getChildren().addAll(balok, kubus);
		hbox2.getChildren().addAll(limas, prisma, kerucut);
		hbox3.getChildren().addAll(tabung, bola);
		
		hbox1.setAlignment(Pos.CENTER);
		hbox2.setAlignment(Pos.CENTER);
		hbox3.setAlignment(Pos.CENTER);

		vbox1.getChildren().addAll(hbox1, hbox2, hbox3);
		vbox1.setAlignment(Pos.CENTER);
				
		hbox1.setSpacing(100);
		hbox2.setSpacing(5);
		hbox3.setSpacing(100);
		vbox1.setSpacing(5);
		
		balok.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
				try{
                stage.setScene(sceneBalok(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		kubus.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
				try{
                stage.setScene(sceneKubus(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		limas.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               try{
                stage.setScene(sceneLimas(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		prisma.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try{
                stage.setScene(scenePrisma(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		kerucut.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               try{
                stage.setScene(sceneKerucut(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		tabung.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                try{
                stage.setScene(sceneTabung(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		bola.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
              try{
                stage.setScene(sceneBola(tampilanAwal, stage));
				}catch(Exception e){
					e.getMessage();
				}
            }
        });
		
		FileInputStream input2= new FileInputStream("D:Geometry_icon.png"); //Akan error kalau path tidak diubah
		Image image2= new Image(input2);
		ImageView imageView2= new ImageView(image2);
		
		stage.getIcons().add(image2);
		stage.setScene(tampilanAwal);
		stage.show();
	
	
	}
	
	public static Scene sceneBalok(Scene x, Stage stage) throws Exception{	
	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(204,0,0));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("BALOK\n");
		
		judul.setFill(Color.rgb(255,255,255));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(204,0,0));
		
		Label panjang= new Label("Panjang\t: ");
		Label lebar= new Label("Lebar\t: ");
		Label tinggi= new Label("Tinggi\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(204,0,0)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(204,0,0)");
		
		panjang.setFont(Font.font(20));
		lebar.setFont(Font.font(20));
		tinggi.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiP= new TextField();
		TextField isiL= new TextField();
		TextField isiT= new TextField();
		TextField isiH= new TextField();
		
		isiP.setPrefWidth(200);
		isiL.setPrefWidth(200);
		isiT.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiP.setPrefHeight(35);
		isiL.setPrefHeight(35);
		isiT.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double angka1= Double.parseDouble(isiP.getText());
			double angka2= Double.parseDouble(isiL.getText());
			double angka3= Double.parseDouble(isiT.getText());
			String hasil2= String.format("%.2f",(angka1*angka2*angka3));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiH, isiL, isiP, isiT);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(panjang, isiP);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(lebar, isiL);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(10);
		hbox3.getChildren().addAll(tinggi, isiT);
		hbox3.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox4= new HBox();
		hbox4.setSpacing(10);
		hbox4.getChildren().addAll(hasil, isiH);
		hbox4.setAlignment(Pos.CENTER);
		
		HBox hbox5= new HBox();
		hbox5.setSpacing(120);
		hbox5.getChildren().addAll(back, retry);
		hbox5.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1, hbox2, hbox3);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox4);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox5);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static Scene sceneKubus(Scene x, Stage stage) throws Exception{	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(250,250,0));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("KUBUS\n\n");																			 
		judul.setFill(Color.rgb(0,0,0));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(250,250,0));
		
		Label rusuk= new Label("Sisi\t\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(250,250,0)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(250,250,0)");
		
		rusuk.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiR= new TextField();
		TextField isiH= new TextField();
		
		isiR.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiR.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double angka1= Double.parseDouble(isiR.getText());
			String hasil2= String.format("%.2f",(angka1*angka1*angka1));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiH, isiR);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(rusuk, isiR);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(hasil, isiH);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(120);
		hbox3.getChildren().addAll(back, retry);
		hbox3.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox2);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox3);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static Scene sceneLimas(Scene x, Stage stage) throws Exception{	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(0,250,255));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("LIMAS\n");																			 
		judul.setFill(Color.rgb(0,0,0));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(0,250,255));
		
		Label panjangAlas= new Label("Panjang Alas\t: ");
		Label lebarAlas= new Label("Lebar Alas\t: ");
		Label tinggi= new Label("Tinggi\t\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(0,250,255)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(0,250,255)");
		
		panjangAlas.setFont(Font.font(20));
		lebarAlas.setFont(Font.font(20));
		tinggi.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiP= new TextField();
		TextField isiL= new TextField();
		TextField isiT= new TextField();
		TextField isiH= new TextField();
		
		isiP.setPrefWidth(200);
		isiL.setPrefWidth(200);
		isiT.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiP.setPrefHeight(35);
		isiL.setPrefHeight(35);
		isiT.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double p= Double.parseDouble(isiP.getText());
			double l= Double.parseDouble(isiL.getText());
			double t= Double.parseDouble(isiT.getText());
			String hasil2= String.format("%.2f",((p*l*t)/3));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiH, isiL, isiP, isiT);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(panjangAlas, isiP);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(lebarAlas, isiL);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(10);
		hbox3.getChildren().addAll(tinggi, isiT);
		hbox3.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox4= new HBox();
		hbox4.setSpacing(10);
		hbox4.getChildren().addAll(hasil, isiH);
		hbox4.setAlignment(Pos.CENTER);
		
		HBox hbox5= new HBox();
		hbox5.setSpacing(120);
		hbox5.getChildren().addAll(back, retry);
		hbox5.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1, hbox2, hbox3);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox4);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox5);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static Scene scenePrisma(Scene x, Stage stage) throws Exception{	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(255,94,0));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("PRISMA\n");																			 
		judul.setFill(Color.rgb(0,0,0));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(255,94,0));
		
		Label panjangAlas= new Label("Panjang Alas\t: ");
		Label lebarAlas= new Label("Lebar Alas\t: ");
		Label tinggi= new Label("Tinggi\t\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(255,94,0)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(255,94,0)");
		
		panjangAlas.setFont(Font.font(20));
		lebarAlas.setFont(Font.font(20));
		tinggi.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiP= new TextField();
		TextField isiL= new TextField();
		TextField isiT= new TextField();
		TextField isiH= new TextField();
		
		isiP.setPrefWidth(200);
		isiL.setPrefWidth(200);
		isiT.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiP.setPrefHeight(35);
		isiL.setPrefHeight(35);
		isiT.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double p= Double.parseDouble(isiP.getText());
			double l= Double.parseDouble(isiL.getText());
			double t= Double.parseDouble(isiT.getText());
			String hasil2= String.format("%.2f",((p*l*t)/2));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiH, isiL, isiP, isiT);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(panjangAlas, isiP);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(lebarAlas, isiL);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(10);
		hbox3.getChildren().addAll(tinggi, isiT);
		hbox3.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox4= new HBox();
		hbox4.setSpacing(10);
		hbox4.getChildren().addAll(hasil, isiH);
		hbox4.setAlignment(Pos.CENTER);
		
		HBox hbox5= new HBox();
		hbox5.setSpacing(120);
		hbox5.getChildren().addAll(back, retry);
		hbox5.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1, hbox2, hbox3);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox4);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox5);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static Scene sceneKerucut(Scene x, Stage stage) throws Exception{	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(125,125,125));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("KERUCUT\n");																			 
		judul.setFill(Color.rgb(0,0,0));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(125,125,125));
		
		Label jari2= new Label("Jari-jari\t: ");
		Label tinggi= new Label("Tinggi\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(125,125,125)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(125,125,125)");
		
		jari2.setFont(Font.font(20));
		tinggi.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiJ= new TextField();
		TextField isiT= new TextField();
		TextField isiH= new TextField();
		
		isiJ.setPrefWidth(200);
		isiT.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiJ.setPrefHeight(35);
		isiT.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double angka1= Double.parseDouble(isiJ.getText());
			double angka2= Double.parseDouble(isiT.getText());
			String hasil2= String.format("%.2f",((22*angka1*angka1*angka2)/21));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiJ, isiT, isiH);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(jari2, isiJ);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(tinggi, isiT);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(10);
		hbox3.getChildren().addAll(hasil, isiH);
		hbox3.setAlignment(Pos.CENTER);
		
		HBox hbox4= new HBox();
		hbox4.setSpacing(120);
		hbox4.getChildren().addAll(back, retry);
		hbox4.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1, hbox2);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox3);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox4);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static Scene sceneTabung(Scene x, Stage stage) throws Exception{	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(18,182,0));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("TABUNG\n");																			 
		judul.setFill(Color.rgb(255,255,255));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(18,182,0));
		
		Label jari2= new Label("Jari-jari\t: ");
		Label tinggi= new Label("Tinggi\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(18,182,0)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(18,182,0)");
		
		jari2.setFont(Font.font(20));
		tinggi.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiJ= new TextField();
		TextField isiT= new TextField();
		TextField isiH= new TextField();
		
		isiJ.setPrefWidth(200);
		isiT.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiJ.setPrefHeight(35);
		isiT.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double angka1= Double.parseDouble(isiJ.getText());
			double angka2= Double.parseDouble(isiT.getText());
			String hasil2= String.format("%.2f",((22*angka1*angka1*angka2)/7));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiJ, isiT, isiH);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(jari2, isiJ);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(tinggi, isiT);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(10);
		hbox3.getChildren().addAll(hasil, isiH);
		hbox3.setAlignment(Pos.CENTER);
		
		HBox hbox4= new HBox();
		hbox4.setSpacing(120);
		hbox4.getChildren().addAll(back, retry);
		hbox4.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1, hbox2);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox3);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox4);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static Scene sceneBola(Scene x, Stage stage) throws Exception{	
		VBox vboxAll= new VBox();
		StackPane group= new StackPane();
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(655);
		imageView.setFitHeight(645);
		
		Rectangle rect2= new Rectangle(10, 100, 370, 385);
		rect2.setFill(Color.rgb(255,255,255));
		
		Rectangle rect3= new Rectangle(10, 100, 380, 395);
		rect3.setFill(Color.rgb(49,0,182));
		
		group.getChildren().addAll(imageView, rect3, rect2, vboxAll);
		Scene scene= new Scene(group, 655, 645);
	
		Text judul= new Text("BOLA\n\n");																			 
		judul.setFill(Color.rgb(255,255,255));
		judul.setFont(Font.font("Times New Roman",60));
		judul.setTextAlignment(TextAlignment.CENTER);
		Rectangle rect= new Rectangle(10, 10, 300, 73);
		rect.setFill(Color.rgb(49,0,182));
		
		Label jari2= new Label("Jari-jari\t: ");
		Label hasil= new Label("Volume\t: ");
		Label spasi= new Label("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		spasi.setFont(Font.font(1));
		
		Button enter= new Button("Enter");
		enter.setAlignment(Pos.CENTER);
		Button back= new Button("Kembali");
		Button retry= new Button("Ulang");
		
		enter.setFont(new Font(20));
		back.setFont(new Font(25));
		back.setStyle("-fx-base: rgb(49,0,182)");
		retry.setFont(new Font(25));
		retry.setStyle("-fx-base: rgb(49,0,182)");
		
		jari2.setFont(Font.font(20));
		hasil.setFont(Font.font(20));
		
		TextField isiJ= new TextField();
		TextField isiH= new TextField();
		
		isiJ.setPrefWidth(200);
		isiH.setPrefWidth(200);
		
		isiJ.setPrefHeight(35);
		isiH.setPrefHeight(35);
		
		enter.setPrefWidth(320);
		back.setPrefWidth(200);
		retry.setPrefWidth(200);
		
        enter.setPrefHeight(80);
		back.setPrefHeight(125);
		retry.setPrefHeight(125);
		
		enter.setOnAction(e->{
			
			try{
				
			double angka1= Double.parseDouble(isiJ.getText());
			String hasil2= String.format("%.2f",((88*angka1*angka1*angka1)/21));
			isiH.setText(hasil2);
			
			}catch(Exception exc){
				isiH.setText("-");
			}
		});
		
		back.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                stage.setScene(x);
            }
        });
		
		retry.setOnAction(e->{
			retryMethod(isiH, isiJ);
		});
		
		HBox hboxJudul= new HBox(judul);
		hboxJudul.setAlignment(Pos.CENTER);
		
		StackPane hbox0= new StackPane(rect, hboxJudul);
		hbox0.setAlignment(Pos.TOP_CENTER);
		
		HBox hbox1= new HBox();
		hbox1.setSpacing(10);
		hbox1.getChildren().addAll(jari2, isiJ);
		hbox1.setAlignment(Pos.CENTER);
		
		HBox hboxEnter= new HBox(enter);
		hboxEnter.setAlignment(Pos.CENTER);
		
		HBox hbox2= new HBox();
		hbox2.setSpacing(10);
		hbox2.getChildren().addAll(hasil, isiH);
		hbox2.setAlignment(Pos.CENTER);
		
		HBox hbox3= new HBox();
		hbox3.setSpacing(120);
		hbox3.getChildren().addAll(back, retry);
		hbox3.setAlignment(Pos.CENTER);
		
		VBox vbox1= new VBox(hbox1);
		vbox1.setSpacing(10);
		
		VBox vbox2= new VBox(hboxEnter, hbox2);
		vbox2.setSpacing(20);
		
		vboxAll.getChildren().addAll(hbox0, vbox1, vbox2, spasi, hbox3);
		vboxAll.setSpacing(20);
		
		return scene;
	}
	
	public static void retryMethod(TextField a, TextField b){
		a.setText("");
		b.setText("");
	}
	
	public static void retryMethod(TextField a, TextField b, TextField c){
		a.setText("");
		b.setText("");
		c.setText("");
	}
	
	public static void retryMethod(TextField a, TextField b, TextField c, TextField d){
		a.setText("");
		b.setText("");
		c.setText("");
		d.setText("");
	}
	
	public static void main(String [] args){
		launch();
	}
	
}