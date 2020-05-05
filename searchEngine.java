import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class searchEngine extends Application{

    @Override
    public void start(Stage primaryStage){

        //set the title of the page
        Text scenetitle = new Text("Noughties Music \nSearch Engine");

        //Initiate the text field and button to submit query
        TextField input = new TextField();
        //add radio buttons one for XML or JSON
        Button btn = new Button();

        //set text of the button and add the event handler
        btn.setText("Search");
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event) {
                //search searching = new search();
                //Add code here to take user input and perform the search (search class)
                //searching.userSearch(input.getText());
                System.out.println(input.getText());
                //initiate the search object

            }
        });

        //initiate the layout
        GridPane root = new GridPane();

        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        //add textbox and buttons to the layout
        root.add(scenetitle, 0, 0);
        root.add(input, 0, 1);
        root.add(btn, 0, 3);
        
        Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("2000's Music Search Engine");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}