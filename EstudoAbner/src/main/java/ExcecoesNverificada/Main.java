package ExcecoesNverificada;

public class Main {
    public static void main(String[] args) {

        try {
            Financiamento obj = new Financiamento(1000,300,10);
            System.out.println(obj.prestacao());
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
