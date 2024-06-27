package ExcecoesVerificada;

public class ExcecoesV {

    public static void main(String[] args) {
        try{
            deMenor(15);
        }catch (DeMenorExeception e){
            System.out.println(e.getMessage());
        }
    }


    public static void deMenor(int idade ) throws DeMenorExeception{
        if(idade < 18){
            throw new DeMenorExeception();
        }else{
            System.out.println("Acesso liberado!");
        }

    }





}
