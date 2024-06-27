package ExcecoesVerificada;

public class DeMenorExeception extends Exception {



    public DeMenorExeception(){
        super("ERRO!");
    }


    public DeMenorExeception(String mensagem){
        super(mensagem);
    }

}
