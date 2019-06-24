package controllers;

import application.Global;
import application.Initializer;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class SacarController {

    private static Initializer screen = new Initializer();

    @FXML
    private void voltar(){
        Global.closeScreen();
        Global.configScreen("Home", "home");
        try {
            screen.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
