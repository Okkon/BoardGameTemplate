package sample.graphics;

import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class MyBottomPane extends VBox {

    private final TextArea textArea = new TextArea();

    public MyBottomPane() {
        getChildren().add(textArea);
    }

    public void log(String s) {
        textArea.appendText(s + "\n");
    }
}
