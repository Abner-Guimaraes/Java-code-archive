package AbstracaoClass.Abstrata;

public class Quadrado extends Forma{
private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }


    @Override
    public double areaDoFig(){
        return Math.pow(this.lado, 2);
    }
}
