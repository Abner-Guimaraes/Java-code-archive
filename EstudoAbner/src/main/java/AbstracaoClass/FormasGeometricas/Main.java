package AbstracaoClass.FormasGeometricas;

public class Main {
    public static void main(String[] args) {

        Retangulo obj = new Retangulo();
        System.out.println(obj.getAltura());
        obj.setAltura(2.00);
        System.out.println(obj.getAltura());
        obj.setLargura(5.00);
        System.out.println(obj.getAltura() +", "+ obj.getLargura());
    }
}