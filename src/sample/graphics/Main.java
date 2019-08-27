package sample.graphics;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.logic.GameModel;
import sample.logic.GraphicsAgent;

public class Main extends Application implements GraphicsAgent {

    //------------LOGIC--------------
    private final GameModel model = new GameModel(this);
    //------------SETTINGS--------------
    private final int prefCellSize = 50;
    //------------GRAPHICS---------------------
    private final GridPane centralPane = new GridPane();
    private final MyRightPane rightPane = new MyRightPane(15);
    private final MyBottomPane bottomPane = new MyBottomPane();

    @Override
    public void start(Stage primaryStage) throws Exception {
        centralPane.setHgap(3);
        centralPane.setVgap(5);
        centralPane.setAlignment(Pos.CENTER);
        for (int i = 0; i < model.getWidth(); i++) {
            for (int j = 0; j < model.getHeight(); j++) {
                GameCellButton button = new GameCellButton(i, j);
                button.setPrefSize(prefCellSize, prefCellSize);
                button.setOnAction(event -> model.press(button.getXY()));

                centralPane.add(button, i, j);
            }
        }

        rightPane.initialize(model);

        BorderPane root = new BorderPane();
        root.setCenter(centralPane);
        root.setBottom(bottomPane);
        root.setRight(rightPane);


        primaryStage.setTitle("BoardGameTemplate");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void log(String s) {
        bottomPane.log(s);
    }

    @Override
    public void notifyChanges() {

    }
}
