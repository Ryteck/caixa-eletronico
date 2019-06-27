package controllers;

import application.Global;
import application.Initializer;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import javax.swing.*;

public class HomeController {

    private static Initializer screen = new Initializer();

    int resposta;

    @FXML
    private void start(){
        resposta = JOptionPane.showOptionDialog(null, "Deseja se conectar como?", "CONECTANDO", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, Global.joption, Global.joption[0]);
        action(resposta);
    }

    private void action(int resposta){

        Global.closeScreen();

        switch (resposta){
            case 0:
                Global.configScreen("Sacar o Dinheiro", "sacar");
                break;
            case 1:
                Global.configScreen("Modificar o Banco", "modificador");
                break;
        }
        try {
            screen.start(new Stage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
