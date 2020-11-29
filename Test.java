import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.*;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.event.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.*;
import javafx.scene.layout.*;
public class Test extends Application 
{   
	public static void main(String[] args)   
	{            
		launch(args);   
	}   
	public void start(Stage primaryStage) throws Exception   
	{   
		primaryStage.setTitle("Hello World");  
		Button button = new Button();   
		button.setText("Click Me!");   
		
		Text message = new Text(75, 100, "Welcome to JavaFX");                  
		// layout of UI Items   
		
		GridPane grid = new GridPane();         
		grid.setVgap(5);                           
		grid.setHgap(5);                           
		grid.add(message, 0, 0);                           
		grid.add(button, 1, 10);   
		Scene scene = new Scene(grid, 300, 250); 	  
		primaryStage.setScene(scene);   
		primaryStage.show();   
	}   
}

