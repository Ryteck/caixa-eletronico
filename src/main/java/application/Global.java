package application;

import enuns.Cedulas;
import models.Banco;

public class Global {

    public final static String jsonDirectory = "./json";
    public final static String jsonPath = "./json/notas.json";

    public final static String iconPath = "./img/caixa_icon.png";

    public static Banco banco;

    public final static Cedulas[] tipos = new Cedulas[]{Cedulas.C002, Cedulas.C005, Cedulas.C010, Cedulas.C020, Cedulas.C050, Cedulas.C100};

    public final static String[] joption = new String[]{"Sacar dinheiro", "Modificar Banco", "Resetar o Banco"};

    public static void configScreen(String title, String path){

        Initializer.sets[0] = "/views/" + path + ".fxml";
        Initializer.sets[1] = title;

    }

    public static void closeScreen(){
        Initializer.getStage().close();
    }

}
