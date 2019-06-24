package controllers;

import application.Global;
import application.Initializer;
import application.JsonConvert;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import exceptions.CedulasNegativasException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import logic.Modificador;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ModificadorController implements Initializable {

    private static Initializer screen = new Initializer();

    private static JsonConvert json = new JsonConvert();
    private static Modificador mod = new Modificador();

    @FXML
    private Label q002;

    @FXML
    private Label q005;

    @FXML
    private Label q010;

    @FXML
    private Label q020;

    @FXML
    private Label q050;

    @FXML
    private Label q100;

    @FXML
    private JFXCheckBox decremento;

    @FXML
    private JFXTextField c002;

    @FXML
    private JFXTextField c005;

    @FXML
    private JFXTextField c010;

    @FXML
    private JFXTextField c020;

    @FXML
    private JFXTextField c050;

    @FXML
    private JFXTextField c100;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        atualizar();
    }

    @FXML
    private void reset(){
        json.resetar();
        atualizar();
    }

    @FXML
    private void modificar(){

        int[] modificador = new int[6];

        if ("".equals(c002.getText())) c002.setText("0");
        if ("".equals(c005.getText())) c005.setText("0");
        if ("".equals(c010.getText())) c010.setText("0");
        if ("".equals(c020.getText())) c020.setText("0");
        if ("".equals(c050.getText())) c050.setText("0");
        if ("".equals(c100.getText())) c100.setText("0");

        try {
            modificador[0] = Integer.parseInt(c002.getText());
            modificador[1] = Integer.parseInt(c005.getText());
            modificador[2] = Integer.parseInt(c010.getText());
            modificador[3] = Integer.parseInt(c020.getText());
            modificador[4] = Integer.parseInt(c050.getText());
            modificador[5] = Integer.parseInt(c100.getText());
            try {
                mod.modificarNotas(modificador, decremento.isSelected());
                atualizar();
            }catch (CedulasNegativasException e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "insira apenas numeros nao muito grandes");
        }
    }

    @FXML
    private void atualizar(){
        q002.setText(String.valueOf(Global.banco.getQuantidade()[0]));
        q005.setText(String.valueOf(Global.banco.getQuantidade()[1]));
        q010.setText(String.valueOf(Global.banco.getQuantidade()[2]));
        q020.setText(String.valueOf(Global.banco.getQuantidade()[3]));
        q050.setText(String.valueOf(Global.banco.getQuantidade()[4]));
        q100.setText(String.valueOf(Global.banco.getQuantidade()[5]));
    }

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
