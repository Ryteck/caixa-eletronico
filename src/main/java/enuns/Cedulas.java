package enuns;

import models.Cedula;

public enum Cedulas {
    C002(new Cedula(2)),
    C005(new Cedula(5)),
    C010(new Cedula(10)),
    C020(new Cedula(20)),
    C050(new Cedula(50)),
    C100(new Cedula(100));

    private Cedula cedula;

    Cedulas(Cedula cedula){
        this.cedula = cedula;
    }

    public Cedula getCedula() {
        return cedula;
    }
}
