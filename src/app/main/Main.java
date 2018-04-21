package app.main;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * @author raphael on 4/21/18.
 */
public class Main extends Application
{
    public static void main(String[] args)
    {
       launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/views/MainInterface.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root, 480, 640);
        primaryStage.setTitle("App");
        primaryStage.setScene(scene);
        primaryStage.show();
//        primaryStage.setFullScreen(true);
//
//        primaryStage.setAlwaysOnTop(true);


        primaryStage.setOnCloseRequest(event -> System.exit(0));
    }
}
