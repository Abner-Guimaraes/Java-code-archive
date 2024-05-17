package Ponto;

public class TestePonto {
    public static void main (String[] args){
        Ponto primeiroPonto = new Ponto(200,200);
        Ponto segundoPonto = new Ponto(400,230);

        System.out.println("Coordenadas do primeiro ponto" + "(" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do primeiro ponto" + "(" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");

        System.out.println("Criação de uma segunda referência para o segundo ponto");
        Ponto outraRefsegundoPonto = segundoPonto;

        System.out.println("Coordenadas do primeiro ponto" + "(" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do primeiro ponto" + "(" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");
        System.out.println("Coordenadas do outraRefSegundoponto" + "(" + outraRefsegundoPonto.getX() + "," + outraRefsegundoPonto.getY() + ")");

        System.out.println("Alterando os valores do segundoponto");
        segundoPonto.setX(100);
        segundoPonto.setY(100);

        System.out.println("Coordenadas do primeiro ponto" + "(" + primeiroPonto.getX() + "," + primeiroPonto.getY() + ")");
        System.out.println("Coordenadas do primeiro ponto" + "(" + segundoPonto.getX() + "," + segundoPonto.getY() + ")");
        System.out.println("Coordenadas do outraRefSegundoponto" + "(" + outraRefsegundoPonto.getX() + "," + outraRefsegundoPonto.getY() + ")");




    }
}
