package Banco;

public class Conta {
    private double saldo;

public Conta(double saldoinicial){
    this.saldo = saldoinicial;
}

//true e false
public boolean Depositar(double valor){
    this.saldo += valor;
    return true;
}

//true e false
public boolean Sacar(double amount){
    //if oq for sacado for > que o saque atual, ou seja dinheiro negativo na conta
    if(amount < saldo){
        this.saldo = saldo - amount;
        return true;
    }
    return false;
}


    public double getSaldo(){
        return saldo;
    }
}
