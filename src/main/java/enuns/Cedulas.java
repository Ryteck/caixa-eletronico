package enuns;

public enum Cedulas {
    C002(2),
    C005(5),
    C010(10),
    C020(20),
    C050(50),
    C100(100);

    private int valor;

    Cedulas(int valor){ this.valor = valor; }

    public int getValor() { return valor; }
}
