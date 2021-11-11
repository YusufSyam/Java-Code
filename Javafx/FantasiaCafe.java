package ModulNo1;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.io.FileInputStream;

public class FantasiaCafe extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
	Group group= new Group();
	Scene sceneAwal= new Scene(group, 900, 620);
	Group subGroup1= new Group();
	group.getChildren().add(tampilkanGambar("Image/Background1.jpg"));
	
	Button pilihMakan= new Button("Pesan Makanan");
	Button keluar= new Button("Keluar dari kafe");
	
	pilihMakan.setPrefSize(325,80);
	pilihMakan.setLayoutX(500);
	pilihMakan.setLayoutY(330);
	
	keluar.setPrefSize(325,80);
	keluar.setLayoutX(500);
	keluar.setLayoutY(465);
	
	group.getChildren().addAll(pilihMakan,keluar);
		
	pilihMakan.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
				try{
                stage.setScene(scenePilihMakan(stage,sceneAwal));
				}catch(Exception e){
					e.getMessage();
				}
            }
     });
	
	keluar.setOnAction(e->{
		stage.close();
	});
	
	FileInputStream input2= new FileInputStream("Image/Iconn.jpg");
	Image image2= new Image(input2);
	ImageView imageView2= new ImageView(image2);
	
	stage.getIcons().add(image2);
	stage.setTitle("Fantasia's Cafe");
	stage.setScene(sceneAwal);
	stage.show();
		
	}

	public static void main(String [] args){
		launch();
	}

	public Scene scenePilihMakan(Stage stage, Scene sceneAwal) throws Exception{
		Group group= new Group();
		Scene scenePilihMakan= new Scene(group, 900, 620);
		group.getChildren().add(tampilkanGambar("Image/Background2.jpg"));
		
		Button back= new Button("Kembali");
		Button pesan= new Button("Bayar Makanan");
		group.getChildren().addAll(back,pesan);
		
		back.setPrefSize(150,50);
		back.setLayoutX(28);
		back.setLayoutY(540);
		
		pesan.setPrefSize(150,50);
		pesan.setLayoutX(722);
		pesan.setLayoutY(540);
		
		group.getChildren().addAll(tampilkanGambarButton("Pancake",35,170), tampilkanGambarButton("Waffle",35,355));
	//	group.getChildren().addAll(tampilkanGambarButton("Tea",350,170), tampilkanGambarButton("Waffle",350,355));
		
		tampilkanInfoMakanan(group, 176.25, 170);
		
		back.setOnAction(e->{
			stage.setScene(sceneAwal);
		});
		
		pesan.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event){
				try{
                stage.setScene(sceneBayar(stage,sceneAwal, scenePilihMakan));
				}catch(Exception e){
					e.getMessage();
				}
            }
		});
		
		return scenePilihMakan;
		
	}
	
	public Scene sceneBayar(Stage stage, Scene sceneAwal, Scene scenePilihMakan) throws Exception{
		Group group= new Group();
		Scene sceneBayar= new Scene(group, 900, 620);
		group.getChildren().add(tampilkanGambar("Image/Background3.jpg"));
		
		Button back= new Button("Kembali");
		group.getChildren().add(back);
			
		back.setPrefSize(150,50);
		back.setLayoutX(28);
		back.setLayoutY(540);
		
		FileInputStream input2= new FileInputStream("Image/Background2.jpg");
		Image image2= new Image(input2);
		ImageView imageView2= new ImageView(image2);
		imageView2.setFitWidth(90);
		imageView2.setFitHeight(62);
		
		Button back2= new Button("", imageView2);
		group.getChildren().add(back2);
			
		back2.setPrefSize(150,50);
		back2.setLayoutX(28);
		back2.setLayoutY(540);
		
		
		back.setOnAction(e->{
			stage.setScene(scenePilihMakan);
		});
		
		return sceneBayar;
	}
	
	public ImageView tampilkanGambar(String a) throws Exception{
		FileInputStream input= new FileInputStream(a);
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(900);
		imageView.setFitHeight(620);
		return imageView;
	}
	
	public ImageView tampilkanGambarButton(String a, int x, int y) throws Exception{
		FileInputStream input= new FileInputStream("Image/"+a+".jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(130);
		imageView.setFitHeight(130);
		imageView.setLayoutX(x);
		imageView.setLayoutY(y);
		return imageView;
	}
	
	public void tampilkanInfoMakanan(Group group, double x, double y) throws Exception{
		FileInputStream input= new FileInputStream("Image/RectangleFill.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		
		Rectangle rect= new Rectangle(x, y, 100, 130);
		rect.setFill(new ImagePattern(image));
		
		Rectangle rect2= new Rectangle(x+5, y+5, 90, 120);
		rect2.setFill(Color.rgb(255,255,255));
		
		Text namaMakanan= new Text("PANCAKE");
		namaMakanan.setFont(Font.font("Segoe Script",13));
		namaMakanan.setX(x+9);
		namaMakanan.setY(y+20);
		
		Text hargaMakanan= new Text("1 GOLD");
		hargaMakanan.setFont(Font.font("Segoe Script",13));
		hargaMakanan.setX(x+9);
		hargaMakanan.setY(y+38);
		
		group.getChildren().addAll(rect,rect2, namaMakanan, hargaMakanan);
	}
	
}