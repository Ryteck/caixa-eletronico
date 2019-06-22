package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Initializer extends Application {

    public static Stage stage;

    public static String[] sets = new String[2];

    public void home() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource(Initializer.sets[0]));

        Scene scene = new Scene(root);

        stage.setTitle(Initializer.sets[1]);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

        setStage(stage);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        Initializer.stage = stage;
    }
}
