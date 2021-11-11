package id.ysf;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import java.io.FileInputStream;
import java.util.Random;

public class HurufHijaiyah extends Application{
	
	Random randomHijaiyah= new Random();
	String angkaRandom;
	Group group;
	Button retry;
	Button Exit;
	Button jawab;
	Text Pertanyaan= new Text();
	TextField isiJawaban;
	ImageView gambarHijaiyah;
	int angkaSebelum= 0;
	int angkaHijaiyah= 0;
	
	@Override
	public void start(Stage stage) throws Exception{
		group= new Group();
		next();
		
		Scene scene= new Scene(group, /*lebar*/ 900, /*panjang*/ 620);
		stage.setScene(scene);
		stage.setTitle("Quiz Hijaiyah");
		stage.show();
	}
	
	public void next() throws Exception{
		angkaRandom= ngeGacha()+"";
		gambarHijaiyah= null;
		gambarHijaiyah= tampilkanGambarHijaiyah(angkaRandom,310,40);
		
		group.getChildren().add(gambarHijaiyah);
		
		Pertanyaan.setText("");
		Pertanyaan.setText(randomHijaiyah.nextInt(2)==1? "Sesudah : " : "Sebelum : ");
		Pertanyaan.setFont(Font.font(18));
		Pertanyaan.setX(310);
		Pertanyaan.setY(440);
		
		isiJawaban= null;
		isiJawaban= new TextField();
		isiJawaban.setPrefSize(180,30);
		isiJawaban.setLayoutX(400);
		isiJawaban.setLayoutY(420);
		
		retry= null;
		retry= new Button("Selanjutnya");
		retry.setPrefSize(95,35);
		retry.setLayoutX(800);
		retry.setLayoutY(580);
		
		Exit= null;
		Exit= new Button("Keluar");
		Exit.setPrefSize(95,35);
		Exit.setLayoutX(5);
		Exit.setLayoutY(580);
		
		jawab= null;
		jawab= new Button("Jawab");
		jawab.setPrefSize(170,50);
		jawab.setLayoutX(365);
		jawab.setLayoutY(470);
		jawab.setFont(Font.font(18));
		
		retry.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event){
					try{
						angkaRandom= ngeGacha()+"";
						next();
					}catch(Exception e){
						e.getMessage();
					}
				}
		});
		
		jawab.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event){
					try{
						sceneJawaban(Pertanyaan.getText());
					}catch(Exception e){
						e.getMessage();
					}
				}
		});
		
		group.getChildren().addAll(retry, Exit, Pertanyaan, isiJawaban, jawab);
	}
	
	public void sceneJawaban(String a){
		int penambah= a.equals("Sesudah")? 1 : -1;
		
		group= null;
		
		retry= null;
		retry= new Button("Selanjutnya");
		retry.setPrefSize(95,35);
		retry.setLayoutX(800);
		retry.setLayoutY(580);
		
		Exit= null;
		Exit= new Button("Keluar");
		Exit.setPrefSize(95,35);
		Exit.setLayoutX(5);
		Exit.setLayoutY(580);
		
		//gambarHijaiyah= tampilkanGambarHijaiyah(angkaRandom,310,40);
		
	}
	
	public int ngeGacha(){
		int angkaRandom2=(randomHijaiyah.nextInt(24)+2);
		
	//	if(angkaRandom2==angkaSebelum) angkaRandom2= ngeGacha();
	//	else angkaSebelum= angkaRandom2;
		
		return angkaRandom2;
	}
	
	public ImageView tampilkanGambarHijaiyah(String a, int x, int y) throws Exception{
		FileInputStream input= new FileInputStream("Hijaiyah/"+a+".jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(280);
		imageView.setFitHeight(360);
		imageView.setLayoutX(x);
		imageView.setLayoutY(y);
		return imageView;
	}
	
	public static void main(String [] args){
		launch();
	}
	
}