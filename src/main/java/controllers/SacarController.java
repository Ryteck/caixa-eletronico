package controllers;

import application.Global;
import application.Initializer;
import com.jfoenix.controls.JFXTextField;
import exceptions.CedulasInsuficientesException;
import exceptions.ResultadoImpossivelException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import logic.Contador;
import logic.Modificador;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SacarController implements Initializable {

    private static Initializer screen = new Initializer();

    private static Contador cont = new Contador();
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
    private JFXTextField valor;

    @Override
    public void initialize(URL location, ResourceBundle resources) { atualizar(); }

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

    @FXML
    private void sacar(){

        int num;
        int quant[];

        try {
            num = Integer.parseInt(valor.getText());
            quant = cont.testador(num);
            mod.modificarNotas(quant, true);
            JOptionPane.showMessageDialog(null, "As quantidade de cédulas retiradas são:\n" +
                    "Cédulas de 2 reais" + quant[0] +
                    "Cédulas de 5 reais" + quant[1] +
                    "Cédulas de 10 reais" + quant[2] +
                    "Cédulas de 20 reais" + quant[3] +
                    "Cédulas de 50 reais" + quant[4] +
                    "Cédulas de 100 reais" + quant[5]);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "insira apenas numeros nao muito grandes");
        }
        catch (CedulasInsuficientesException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (ResultadoImpossivelException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        atualizar();
    }

    private void atualizar(){
        q002.setText(String.valueOf(Global.banco.getQuantidade()[0]));
        q005.setText(String.valueOf(Global.banco.getQuantidade()[1]));
        q010.setText(String.valueOf(Global.banco.getQuantidade()[2]));
        q020.setText(String.valueOf(Global.banco.getQuantidade()[3]));
        q050.setText(String.valueOf(Global.banco.getQuantidade()[4]));
        q100.setText(String.valueOf(Global.banco.getQuantidade()[5]));
    }
}
