package Transportadora;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Veiculos obj = new Veiculos(1000);

        System.out.println("Adicionado caixa numero 1 500 kg:" + obj.adicionarCarga(500));
        System.out.println("Adicionado caixa numero 1 250 kg:"+ obj.adicionarCarga(250));;
        System.out.println("Adicionado caixa numero 1 1000 kg:"+ obj.adicionarCarga(1000));
        System.out.println("Adicionado caixa numero 1 3000 kg:"+ obj.adicionarCarga(3000));


        System.out.println(obj.getCarga());

    }
    }