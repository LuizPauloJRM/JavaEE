package main.java.exercicios.oop;

public class Main {

    public static void main(String[] args) {

        //Criando objetos conta 1 e 2 a partir da classe
        ContaBancaria conta1 = new ContaBancaria("Luiz", 1388525);
        ContaBancaria conta2 = new ContaBancaria("Paulo", 163398);

        // DEPÓSITO
        if (conta1.depositar(500)) {
            System.out.println("Depósito realizado com sucesso");
        } else {
            System.out.println("Erro ao realizar depósito");
        }

        // SAQUE
        if (conta1.sacar(100)) {
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Erro ao realizar saque");
        }

        // SAQUE INVÁLIDO
        if (!conta1.sacar(1000)) {
            System.out.println("Tentativa de saque inválida (saldo insuficiente)");
        }

        // TRANSFERÊNCIA
        if (conta1.transferir(200, conta2)) {
            System.out.println("Transferência realizada com sucesso");
        } else {
            System.out.println("Erro na transferência");
        }

        // TRANSFERÊNCIA INVÁLIDA
        if (!conta1.transferir(1000, conta2)) {
            System.out.println("Tentativa de transferência inválida");
        }

        // RESULTADO FINAL
        System.out.println(conta1);
        System.out.println(conta2);
    }
}
