package Banco;

public class Conta {
    private double saldo;

public Conta(double saldoinicial){
    this.saldo = saldoinicial;
}

//true e false
public double Depositar(double valor){
    this.saldo += valor;
    return saldo;
}

//true e false
public boolean Sacar(double amount){
    if(saldo > (saldo - amount)){
        this.saldo -= amount;
        return true;
    }
    return false;
}


    public double getSaldo(){
        return saldo;
    }
}
