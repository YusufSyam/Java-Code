package id.ysf;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Biodata extends Application implements EventHandler <MouseEvent>{
    private Button btnSubmit;
    private TextField tfName;
    private Label labelAge; 
    private boolean isClicked;
    private TextField day;
    private TextField month;
    private TextField year;

    @Override
    public void start(Stage primaryStage) throws Exception {
        String title = "BIODATA";
        Text text = new Text ("Nama :");
        Text text2 = new Text("Tanggal Lahir :");

        String bio = "Silahkan Masukkan Biodata : ";
        Label nameLabel = new Label();
        nameLabel.setText(bio);
        nameLabel.setFont(Font.font("Times New Roman",20));

        btnSubmit = new Button("Submit");
        tfName = new TextField();
        labelAge = new Label();
        day = new TextField();
        month = new TextField();
        year = new TextField();

        tfName.setPrefWidth(200);
        day.setPrefWidth(35);
        month.setPrefWidth(35);
        year.setPrefWidth(50);
        btnSubmit.setOnMouseClicked(this);

        HBox hbox = new HBox();
        hbox.getChildren().addAll(labelAge);
        hbox.setAlignment(Pos.CENTER);
        hbox.setSpacing(12);

        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(text, tfName);
        hbox1.setAlignment(Pos.CENTER);
        hbox1.setMaxWidth(235);
        hbox1.setSpacing(12);
        
        HBox hbox2 = new HBox();
        hbox2.getChildren().addAll(text2, day, month, year);
        hbox2.setAlignment(Pos.CENTER);
        hbox2.setSpacing(12);
        
        VBox vBox = new VBox();
        vBox.getChildren().add(nameLabel);
        vBox.getChildren().add(hbox);
        vBox.getChildren().add(hbox1);
        vBox.getChildren().add(hbox2);
        vBox.getChildren().add(btnSubmit);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);

        StackPane pane = new StackPane(vBox);
        Scene scene = new Scene(pane, 800, 480);
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
        primaryStage.show();
        // pane.getChildren().add(vBox);
        
    }
        public static void main(String[] args) {
            launch(args);
        }

        // btnSubmit.setOnMouseClicked(new EventHandler<MouseEvent>(){

            @Override
            public void handle (MouseEvent event){
                if (isClicked == false){
                    String nama = tfName.getText();
                    int birth = Integer.parseInt(year.getText());
                    int umur = 2019-birth;
                    labelAge.setText(String.valueOf(String.format("\"Umur %s tahun ini adalah %d tahun\"",nama, umur)));
                    labelAge.setFont(Font.font("Times New Roman", 14));
                    btnSubmit.setText("Retry");
                    isClicked = true;
                } else {
                    labelAge.setText("");
                    day.setText("");
                    month.setText("");
                    year.setText("");
                    btnSubmit.setText("Submit");
                    isClicked = false;
                    
                }
            }
    //     });
    //     btnSubmit.setOnMouseClicked(e ->{

    //     });

            
    // }



}
