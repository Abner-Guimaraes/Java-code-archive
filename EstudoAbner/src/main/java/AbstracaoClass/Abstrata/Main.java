package AbstracaoClass.Abstrata;

public class Main {


    public static void main(String[] args) {
        System.out.println("Ola");
        Forma obj = new Circulo(20);
        System.out.printf("%.2f\n",obj.areaDoFig());

        Forma obj2 = new Quadrado(4);


        System.out.println(obj2.areaDoFig());



    }


}
