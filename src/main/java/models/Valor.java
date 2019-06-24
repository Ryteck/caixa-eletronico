package models;

public class Valor {

    public static int teste;
    public static int valorAtual = 0;

    private int valorProprio = 0;
    private int quantidadePropria = 0;
    private boolean habilited = true;

    public void reset(){
        valorAtual -= valorProprio;
    }

    public void setValorProprio(int valorProprio) {
        this.valorProprio = valorProprio;
        valorAtual +=valorProprio;
    }

    public int getQuantidadePropria() {
        return quantidadePropria;
    }

    public void setQuantidadePropria(int quantidadePropria) {
        this.quantidadePropria = quantidadePropria;
    }

    public boolean isHabilited() {
        return habilited;
    }

    public void setHabilited(boolean habilited) {
        this.habilited = habilited;
    }
}
