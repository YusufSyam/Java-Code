package id.ysf;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.shape.DrawMode; 
import javafx.scene.layout.*; 
import javafx.event.ActionEvent; 
import javafx.scene.shape.*; 
import javafx.scene.control.*; 
import javafx.stage.Stage; 
import javafx.scene.text.*;
import javafx.scene.Group; 
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import javafx.scene.Group;

public class box_0 extends Application { 
  
    // launch the application 
    public void start(Stage stage) throws Exception
    { 
        // set title for the stage 
        stage.setTitle("creating box"); 
		Group root= new Group();
        // create a box 
        Rectangle box1 = new Rectangle(200, 0, 300, 180);
		box1.setFill(Color.RED);
		Text teks= new Text("Merah");
		Text teks2= new Text("Uwau");
		
		
        // create a Group 
        StackPane group = new StackPane(box1, teks);
		VBox vbox1= new VBox(group, teks2);
  
        // create a scene 
        Scene scene = new Scene(root, 500, 300); 
		FileInputStream input= new FileInputStream("D:\\geometry_2.jpg");
		Image image= new Image(input);
		ImageView imageView= new ImageView(image);
		
		
		root.getChildren().add(imageView);
        // set the scene 
        stage.setScene(scene); 
		stage.setResizable(false);
        stage.show(); 
    } 
  
    public static void main(String args[]) 
    { 
        // launch the application 
        launch(args); 
    } 
} 