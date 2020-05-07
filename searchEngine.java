import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
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
        final ToggleGroup group = new ToggleGroup();
        RadioButton xml = new RadioButton();
        RadioButton html = new RadioButton();

        xml.setText("XML");
        html.setText("HTML"); 

        xml.setToggleGroup(group);
        html.setToggleGroup(group);

        //set the default output to xml
        xml.setSelected(true);

        //Submit button
        Button btn = new Button();

        //set text of the button and add the event handler
        btn.setText("Search");
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event) {

                search searching = new search(input.getText());
                String result = new String();
                
                //Add code here to take user input and perform the search (search class)
                if (group.getSelectedToggle() == xml) {
                    result = searching.returnSearchResultXML();
                } else if (group.getSelectedToggle() == html) {
                    result = searching.returnSearchResultHTML();
                } else {
                    result = "something went wrong";
                }



                //initiate the second screen to display result

                Stage secondStage = new Stage();

                GridPane root2 = new GridPane();

                root2.setAlignment(Pos.CENTER);
                root2.setHgap(10);
                root2.setVgap(10);
                root2.setPadding(new Insets(25, 25, 25, 25));

                Text sceneContent = new Text(result);

                root2.add(sceneContent, 0 , 0);

                Scene scene2 = new Scene(root2, 300, 275);

                secondStage.setTitle("2000's Music Search Engine");
                secondStage.setScene(scene2);
                secondStage.show();
            }
        });

        //initiate the layout
        GridPane root = new GridPane();

        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25, 25, 25, 25));

        //add textbox, submit and radio buttons to the layout
        root.add(scenetitle, 0, 0);
        root.add(input, 0, 1);
        root.add(xml, 0, 2);
        root.add(html, 1, 2);
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