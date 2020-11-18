import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

public class ButtonManager implements EventHandler<ActionEvent> {

    private Text label;

    public ButtonManager(Text label) {
        this.label = label;
    }

    @Override
    public void handle(ActionEvent event) {
        label.setText("Well done.\nYou clicled me!");
    }

}