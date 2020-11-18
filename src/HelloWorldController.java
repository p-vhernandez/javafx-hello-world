import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloWorldController {

    @FXML
    private Label label;

    @FXML
    private Button button;

    @FXML
    void changeLabel(ActionEvent event) {
        label.setText("Well done.\nYou clicked me!");
    }

    @FXML
    void initialize() {
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'hello-world.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'hello-world.fxml'.";

    }
}
