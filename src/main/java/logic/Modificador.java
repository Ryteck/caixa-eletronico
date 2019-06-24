package logic;

import application.Global;
import application.JsonConvert;

public class Modificador {

    private JsonConvert json = new JsonConvert();

    public void modificarNotas(int[] modificador, boolean isDecremento){

        int[] quantidade = Global.banco.getQuantidade();

        for (int cont = 0; cont < quantidade.length; cont++){
            if (isDecremento){
                quantidade[cont] -= modificador[cont];
            }else {
                quantidade[cont] += modificador[cont];
            }
        }

        Global.banco.setQuantidade(quantidade);

        json.serialization();
    }
}
