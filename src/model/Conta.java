package model;

public abstract class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
