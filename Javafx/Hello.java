package id.ysf.scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application{
	@Override
	public void start(Stage PrimaryStage) throws Exception{
		Label a= new Label();
		a.setText("Yusuf");
		var scene = new Scene(new StackPane(label), 640, 480);
        PrimaryStage.setScene(scene);
        PrimaryStage.show();
	}
	
	public static void main(String [] args){
		launch();
	}
	
}