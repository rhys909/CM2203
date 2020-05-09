import java.util.Arrays;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
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
        RadioButton xmlBtn = new RadioButton();
        RadioButton jsonBtn = new RadioButton();

        xmlBtn.setText("XML");
        jsonBtn.setText("JSON"); 

        xmlBtn.setToggleGroup(group);
        jsonBtn.setToggleGroup(group);

        //set the default output to xml
        xmlBtn.setSelected(true);

        //Submit button
        Button btn = new Button();

        //set text of the button and add the event handler
        btn.setText("Search");
        btn.setOnAction(new EventHandler<ActionEvent>(){
        
            @Override
            public void handle(ActionEvent event) {
                //initiate the dict class
                String[] albumsArray = dictionary.AlbumsArrayCreator();
                String[] artistArray = dictionary.ArtistArrayCreator();

                //initiate the second screen to display result
                
                if (input.getText() != null){
                    String userInput = input.getText();
                    String searchUserInput = new String(userInput);
                    String result = new String();
                    
                    //Add code here to take user input and perform the search (search class)
                    if (group.getSelectedToggle() == xmlBtn) {
                        if (Arrays.asList(albumsArray).contains(userInput)){
                            result = queryBuilder.queryAlbumXML(searchUserInput);
                        }else{

                        }  
                    } else if (group.getSelectedToggle() == jsonBtn) {
                        if(Arrays.asList(albumsArray).contains(userInput)){
                            String temp = queryBuilder.queryAlbumXML(searchUserInput);
                            result += queryBuilder.XMLtoJSON(temp);
                        }else{
                            
                        }

                    } else {
                        result += "something went wrong";
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
                } else{
                    //add code here to return an error page or flash error message saying not in controlled environment
                    
                    Stage errorStage = new Stage();
    
                    GridPane root3 = new GridPane();
    
                    root3.setAlignment(Pos.CENTER);
                    root3.setHgap(10);
                    root3.setVgap(10);
                    root3.setPadding(new Insets(25, 25, 25, 25));
    
                    Text sceneContent = new Text("There has been error!");
    
                    root3.add(sceneContent, 0 , 0);
    
                    Scene scene3 = new Scene(root3, 300, 275);
    
                    errorStage.setTitle("2000's Music Search Engine");
                    errorStage.setScene(scene3);
                    errorStage.show();
                }

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