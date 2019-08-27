package sample.graphics;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import sample.logic.GameModel;

public class MyRightPane extends VBox {
    public MyRightPane(int spacing) {
        super(spacing);
    }

    public void initialize(GameModel model) {
        setSpacing(30);
        setAlignment(Pos.TOP_CENTER);
        setBackground(createBackground());
        Button restartButton = new Button("RESTART");
        restartButton.setOnAction(event -> model.restart());
        Button endButton = new Button("Redraw");
        getChildren().addAll(restartButton, endButton);
        setMargin(restartButton, createInsets(20));
    }

    private Insets createInsets(int insets) {
        return createInsets(insets, insets);
    }

    private Insets createInsets(int topBottom, int leftRight) {
        return new Insets(topBottom, leftRight, topBottom, leftRight);
    }

    private Background createBackground() {
        return new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, Insets.EMPTY));
    }
}
