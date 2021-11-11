package id.ysf;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import java.io.FileInputStream;

public class TestFadingImage extends Application{
	
	@Override
	public void start(Stage stage) throws Exception{
		stage.setTitle("Fading Image");
		
		Group group= new Group(tampilkanGambar());
		
		Scene aplikasi2= new Scene(group, 800, 600);
		stage.setScene(aplikasi2);
		stage.show();
		
		Button bt2= new Button("WIWIWI");
				Group group2= new Group(bt2);
		
		Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
                return null;
            }
        };
		
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
				Scene aplikasi= new Scene(group2, 800, 600);
				stage.setScene(aplikasi);
            }
        });
        new Thread(sleeper).start();
		
		}
		
	public void tampilanPembuka(){
		
		
		
	}
	
	public ImageView tampilkanGambar() throws Exception{
		FileInputStream input= new FileInputStream("image/Background-Start.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		imageView.setFitWidth(800);
		imageView.setFitHeight(600);
		return imageView;
	}
	
	public static void main(String [] args){
		launch();
	}
	
}