package models;

import application.Global;
import enuns.Cedulas;

public class Banco {
    private Cedulas[] tipo;
    private int[] quantidade;

    public Banco(){
        this.tipo = Global.tipos;
        quantidade = new int[]{0, 0, 0, 0, 0, 0};
    }

    public Banco(Cedulas[] tipo, int[] quantidade){ this.tipo = tipo; this.quantidade = quantidade; }

    public Cedulas[] getTipo() { return tipo; }

    public int[] getQuantidade() { return quantidade; }

    public void setQuantidade(int[] quantidade) { this.quantidade = quantidade; }

    public int getTotal(){
        int total = 0;
        for (int cont = 0; cont < tipo.length; cont++){
            total += (tipo[cont].getValor() * quantidade[cont]);
        }
        return total;
    }
}
