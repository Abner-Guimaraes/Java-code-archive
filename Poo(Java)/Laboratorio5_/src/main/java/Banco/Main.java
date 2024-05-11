package Banco;
import java.util.Scanner;

//20 de multiplas escolhas

public class Main {
    public static void main(String[] args){
        Conta usuario1 = new Conta(1000);
        Conta usuario2 = new Conta(5000);
        Conta usuario3 = new Conta(30000);
        Scanner scanner = new Scanner(System.in); // objeto para leitura do tipo Scanner;

        System.out.print("Digite o valor inicial do saldo:");
        double decimalNumberDouble = scanner .nextShort();
        System.out.print(decimalNumberDouble);


        System.out.println("Criando uma conta com saldo de: R$" + usuario3.getSaldo());
        System.out.println("Depositando: R$250");
        usuario3.Depositar(1537);
        System.out.println("Sacando: R$100");
        usuario3.Sacar(20322);
        System.out.println("O saldo da conta é: R$"+ usuario3.getSaldo());

    }
}
