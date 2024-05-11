package Banco;

public class Conta {
    private double saldo;
public Conta(double saldoinicial){
    this.saldo = saldoinicial;
}
public double Depositar(double valor){
    this.saldo += valor;
    return saldo;
}
public double Sacar(double amount){
    this.saldo -= amount;
    return saldo;
}
    public double getSaldo(){
        return saldo;
    }
}
