package exceptions;

public class CedulasNegativasException extends RuntimeException{

    public CedulasNegativasException(){ super("As cedulas nao devem ser negativas"); }

}
