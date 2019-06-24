package exceptions;

public class CedulasInsuficientesException extends RuntimeException {

    public CedulasInsuficientesException(){
        super("O número de cédulas é insuficiente para o valor necessario");
    }

}
