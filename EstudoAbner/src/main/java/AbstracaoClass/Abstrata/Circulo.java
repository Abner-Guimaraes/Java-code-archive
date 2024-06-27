package AbstracaoClass.Abstrata;

public class Circulo extends Forma{

    private double raio;
    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double areaDoFig(){
        return Math.PI * Math.pow(this.raio,2);
    }
}
