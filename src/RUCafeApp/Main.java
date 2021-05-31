package RUCafeApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class loads the fxml file and sets the scene for the GUI.
 *
 * @author Siddhi Kasera, Sonal Madhok
 **/
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainMenu.fxml"));
        primaryStage.setTitle("RU Cafe");
        primaryStage.setScene(new Scene(root, 650, 420));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
