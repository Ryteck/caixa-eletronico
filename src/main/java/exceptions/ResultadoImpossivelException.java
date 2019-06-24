package exceptions;

public class ResultadoImpossivelException extends RuntimeException{

    public ResultadoImpossivelException(){
        super("Valor impossivel de ser retirado, digite outro");
    }

}
