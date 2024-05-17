package Banco;
import java.util.Scanner;

//20 de multiplas escolhas;

public class TesteBanco {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // objeto para leitura do tipo Scanner;

        System.out.print("Digite o valor inicial do saldo:");
        double decimalNumberDouble = scanner .nextDouble();
        System.out.println(decimalNumberDouble);
        Conta usuario3 = new Conta(decimalNumberDouble);


        System.out.println("Criando uma conta com saldo de: R$" + usuario3.getSaldo());
        System.out.println("Depositando: R$1537");
        usuario3.Depositar(1537);
        System.out.println("Conta após Depósito: R$" + usuario3.getSaldo());

        System.out.println("Sacando: R$20322");
        if(usuario3.Sacar(20322)){
            System.out.println("Conta após saque: R$" + usuario3.getSaldo());
        } else {
            System.out.println("Não foi possivel sacar, o saldo ainda eh de: R$" + usuario3.getSaldo());
        }


    }
}
