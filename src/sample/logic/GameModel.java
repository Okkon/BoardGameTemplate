package sample.logic;

import sample.utils.XY;

import java.util.Arrays;
import java.util.List;

public class GameModel {
    private int width = 8;
    private int height = 6;
    private GraphicsAgent graphicsAgent;
    private List<Player> players = Arrays.asList(new Player("White"), new Player("Black"));
    private Player currentPlayer = players.get(0);

    public GameModel(GraphicsAgent graphicsAgent) {
        this.graphicsAgent = graphicsAgent;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void press(XY xy) {
        graphicsAgent.log(xy.toString());
        graphicsAgent.notifyChanges();
    }

    public void restart() {

    }
}
