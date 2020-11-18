import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Pane extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FlowPane root = new FlowPane();
            Scene scene = new Scene(root, 400, 400);
            scene.getStylesheets().add(getClass().getResource("css/pane.css").toExternalForm());
            primaryStage.setTitle("Hello world!");
            primaryStage.setScene(scene);

            Text newLabel = new Text("I'm a label!");
            root.getChildren().add(newLabel);
            newLabel.setFont(Font.font("Verdana", 50));
            root.setAlignment(Pos.CENTER);

            Button button = new Button("Click me!");
            root.getChildren().add(button);

            button.setOnAction(new ButtonManager(newLabel));

            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
}
