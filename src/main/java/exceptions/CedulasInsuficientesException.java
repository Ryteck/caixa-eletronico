package exceptions;

public class CedulasInsuficientesException extends RuntimeException {

    public CedulasInsuficientesException(){
        super("O numero de cedulas e insuficiente para o valor necessario");
    }

}
