package main.java.exercicios.oop;

public class ContaBancaria {
    // ATRUBUTOS DA CONTA
    private String titular;
    private double saldo;
    private int numeroConta;

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;//Conta inicia com valor 0
    }

    //DEPÓSITO
    public boolean depositar(double valor) {
        if (valor <= 0) return false;//Aqui para nao ter valor negativo

        this.saldo += valor;
        return true;
    }

    //SAQUE
    public boolean sacar(double valor) {
        if (valor <= 0 || valor > this.saldo) return false;

        this.saldo -= valor;
        return true;
    }

    //TRANFERENCIA
    public boolean transferir(double valor, ContaBancaria destino) {
        if (valor <= 0 || destino == null) return false;

        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }

        return false;
    }


    //Getters and Setters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta [Titular: " + titular +
                ", Nº: " + numeroConta +
                ", Saldo: R$ " + saldo + "]";
    }
}
