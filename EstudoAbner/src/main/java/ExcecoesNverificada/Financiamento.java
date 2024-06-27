package ExcecoesNverificada;

public class Financiamento {

    private double valortotal;
    private double entrada;
    private int parcelas;

    public double prestacao(){
        return (valortotal - entrada)/parcelas;
    }

    public Financiamento(){
        this.valortotal = 0;
        this.entrada = 0;
        this.parcelas = 0;
    }


    public Financiamento(double valortotal,  double entrada, int parcelas) {


        if (entrada < valortotal * 0.2) {
            throw new RuntimeException("Não foi possivel");
        } else if (parcelas < 6) {
            throw new RuntimeException("Parcelas menor que 6");
        }
        this.valortotal = valortotal;
        this.entrada = entrada;
        this.parcelas = parcelas;


    }
}
