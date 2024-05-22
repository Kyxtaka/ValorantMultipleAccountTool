package app;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;
/**
 * Hello world!
 *
 */
public class App extends Application {
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void init() {

    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        stage = new Scene(root,900,700);
        stage.setTitle("Test");
        stage.show();
    }
}
