package AbstracaoClass.FormasGeometricas;

public class Retangulo {
    private double altura, largura;

    //criação de um construtor

    public Retangulo(){
        this(0,0);
    }

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    //area e perimetro, duas funções(métodos)

}
