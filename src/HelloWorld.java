import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("fxml/hello-world.fxml"));
            // Initial windows size is provided
            Scene scene = new Scene(root, 400, 400);

            //JavaFX calculate windows size
            //Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("css/pane.css").toExternalForm());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
