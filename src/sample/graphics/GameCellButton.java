package sample.graphics;

import javafx.scene.control.Button;
import sample.utils.XY;

public class GameCellButton extends Button {

    private final XY xy;

    public GameCellButton(int x, int y) {
        super(x + " : " + y);
        this.xy = new XY(x, y);
    }

    public XY getXY() {
        return xy;
    }
}
