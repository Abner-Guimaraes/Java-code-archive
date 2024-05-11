package Transportadora;

public class Veiculos {

    private double carga;
    private double cargaMaxima;

    public Veiculos(double cargaMaxima){
        this.cargaMaxima =newtonparaquilo(cargaMaxima);
    }

    public boolean adicionarCarga(double peso){


        if(this.cargaMaxima < this.carga + newtonparaquilo(peso)){
            return false;
        }
        this.carga += newtonparaquilo(peso);
        return true;
    }

    private double newtonparaquilo(double peso){
        //1 newton == 9.0kg
        return peso/9.0;
    }
    private double quiloparanewton(double peso){
        return peso * 9.0;
    }

    public double getCarga(){
        return quiloparanewton(carga);
    }
    public double getCargaMaxima(){
        return cargaMaxima;
    }
}
