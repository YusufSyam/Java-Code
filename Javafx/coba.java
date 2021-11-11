package id.ysf;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.text.*;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public class coba  extends Application{
    @Override
    public void start(Stage gifari) throws Exception{
		
		FileInputStream input1= new FileInputStream("D:\\icon2.jpg");
		Image image1= new Image(input1);
		ImageView imageView1= new ImageView(image1);
		imageView1.setFitWidth(500);
		imageView1.setFitHeight(500);
		
		FileInputStream input2= new FileInputStream("D:\\icon.jpg");
		Image image2= new Image(input2);
		
        gifari.setTitle("Menentukan Berat Badan");
        VBox vbox= new VBox();
        StackPane pane = new StackPane(imageView1, vbox);
        Scene scene = new Scene(pane, 600, 600);

        Rectangle rect1= new Rectangle(150, 3);
        Rectangle rect2= new Rectangle(150, 3);
        Rectangle rect3= new Rectangle(150, 3);
		
		Label spasi= new Label("\n\n\n\n\n\n\n\n");
        Label kekurangan= new Label("Kekurangan");
        Label ideall= new Label("Ideal");
        Label kelebihan= new Label("Kelebihan");
		
		Label cm= new Label("   Cm");
		Label kg= new Label("   Kg");

        Label angka1= new Label("18");
        Label angka2= new Label("25");

        Label tinggi = new Label("Tinggi\t:\t");
        Label berat = new Label("Berat\t:\t");
		
		cm.setFont(Font.font(12));
		kg.setFont(Font.font(12));
		tinggi.setFont(Font.font(14));
		berat.setFont(Font.font(14));
		
        Label hasil = new Label();
        Label bmi= new Label();
        Label isiBmi= new Label();
        Label inform= new Label("\n\nInformation\n");

        TextField  isiTinggi = new TextField();
        TextField isiBerat = new TextField();

        Button enter = new Button("GO");

        enter.setOnAction(e->{
        try{
        double t= Double.parseDouble(isiTinggi.getText());
		
		if(t==0){
			hasil.setText("Input anda salah");
			return;
		}
		
        t/=100;
        double b= Double.parseDouble(isiBerat.getText());
        double ideal= b/(t*t);
        String status=  "";
       
            if(ideal<18.25){
                hasil.setText("Anda termasuk kurus atau memiliki berat badan kurang");
                status= "Kekurangan";
                String bmiString= String.format("%.1f\n%s",ideal,status);
                isiBmi.setText(bmiString);
                isiBmi.setTextFill(Color.rgb(109,34,238));
            }else if(ideal>=18.25 && ideal<=25){
                hasil.setText("Berat badan anda ideal");
                status= "Normal";
                String bmiString= String.format("%.1f\n%s",ideal,status);
                isiBmi.setText(bmiString);
                isiBmi.setTextFill(Color.rgb(0,250,0));
            }else if(ideal>25){
                hasil.setText("Anda termasuk obesitas atau memiliki berat badan lebih");
                status= "Kelebihan";
                String bmiString= String.format("%.1f\n%s",ideal,status);
                isiBmi.setTextFill(Color.rgb(250, 100,0));
                isiBmi.setText(bmiString);
            }
            
           
            bmi.setText("BMI\t");
            }catch(Exception op){
                hasil.setText("Input anda salah");
                isiBmi.setText("");
                bmi.setText("");
            }
        });

        
        bmi.setFont(Font.font(43));
        isiBmi.setFont(Font.font(15));
        inform.setFont(Font.font("Times New Roman", 25));
        angka1.setFont(Font.font(11));
        angka2.setFont(Font.font(11));

        rect1.setFill(Color.rgb(109,34,238));
        rect2.setFill(Color.rgb(0,250,0));
        rect3.setFill(Color.rgb(250, 100,0));

        kekurangan.setTextFill(Color.rgb(109,34,238));
        ideall.setTextFill(Color.rgb(0,250,0));
        kelebihan.setTextFill(Color.rgb(250, 100,0));

        HBox hbox1= new HBox(tinggi, isiTinggi, cm);
        HBox hbox2= new HBox(berat, isiBerat, kg);
        HBox hbox3= new HBox(bmi, isiBmi);
        HBox hbox4= new HBox(kekurangan, ideall, kelebihan);
        HBox hbox5= new HBox(rect1, rect2, rect3);
        HBox hbox6= new HBox(angka1, angka2);
		
        hbox4.setSpacing(150);
        hbox6.setSpacing(140);

        hbox1.setAlignment(Pos.CENTER);
        hbox2.setAlignment(Pos.CENTER);
        hbox3.setAlignment(Pos.CENTER);
        hbox4.setAlignment(Pos.CENTER);
        hbox5.setAlignment(Pos.CENTER);
        hbox6.setAlignment(Pos.CENTER);

        vbox.getChildren().addAll(spasi, hbox1, hbox2, enter, hbox3, hasil, inform, hbox4, hbox5, hbox6);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
		
		gifari.getIcons().add(image2);
        gifari.setScene(scene);
        gifari.show();
    }
    public static void main(String[] args){
        launch();
    }
}