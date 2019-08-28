package sample.graphics;

import javafx.scene.control.Button;
import sample.logic.GameModel;
import sample.utils.XY;

public class GameCellButton extends Button {

    private final int prefCellSize = 50;
    private final XY xy;

    public GameCellButton(int x, int y, GameModel model) {
        super(x + " : " + y);
        this.xy = new XY(x, y);
        setPrefSize(prefCellSize, prefCellSize);
        setOnAction(event -> model.press(this.getXY()));
    }

    public XY getXY() {
        return xy;
    }
}
