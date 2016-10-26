package paint.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GUIMain extends Application {

	@Override
    public void start(Stage primaryStage) throws IOException {
        Pane root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        primaryStage.setTitle("Paint");
        primaryStage.setMinHeight(700);
        primaryStage.setMinWidth(600);
        primaryStage.setScene(new Scene(root, 1065, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}