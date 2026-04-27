    package exercicios.oop;

/**
     * =============================================
     * EXERCICIO 01 - ENCAPSULAMENTO
     * =============================================
     * OBJETIVO:
     * Implementar uma conta bancaria com estado protegido e regras de negocio
     * definidas dentro da propria classe.
     *
     * O QUE A ATIVIDADE PEDE:
     * - Crie a classe ContaBancaria com os atributos privados titular, saldo e
     *   numeroConta.
     * - Receba titular e numeroConta no construtor e inicie saldo com 0.
     * - Disponibilize getters para todos os campos e setter apenas para titular.
     * - Garanta que saldo nunca fique negativo.
     * - Implemente depositar(), sacar() e transferir() com as validacoes
     *   necessarias.
     * - Sobrescreva toString() no formato indicado no exercicio.
     *
     * O QUE DEMONSTRAR NO main:
     * - Criacao de duas contas e operacoes de deposito, saque e transferencia.
     * - Tentativas invalidas, como deposito negativo e saque sem saldo.
     *
     * PARA REVISAR:
     * - O que e encapsulamento e como ele protege o estado do objeto.
     */
    public class Ex01_Encapsulamento {

        public class ContaBancaria {
            //     ATRIBUTOS
            private String titular;
            private double saldo;
            private int numeroConta;


            //      CONSTRUTOR  : Para receber os dados
            public ContaBancaria(String titular, int numeroConta) {
                this.titular = titular;
                this.numeroConta = numeroConta;
                this.saldo = 0.0;// Inicia o valor da conta com  0
            }
            //      REGRAS DE NEGÓCIO
            //      Evitar saldo négativo
            //      Criando um metodo depositar , sacar e transferencia

            public void depositar(double valor) {
                if (valor > 0) {
                    this.saldo += valor;
                    System.out.println("Depósito de R$ " + valor + "Realizado");

                } else {
                    System.out.println("Valor negativo");
                }
            }

            public void sacar(double valor) {
                if (valor > 0 && valor <= this.saldo) {
                    this.saldo -= valor;
                    System.out.println("Saque de R$" + valor + " realizado.");
                } else {
                    System.out.println("Saldo insuficiente ou valor inválido para o saque");
                }
            }

            // GETTERS (Para permitir a leitura dos dados)
            public String getTitular() {
                return titular;
            }

            public double getSaldo() {
                return saldo;
            }

            public int getNumeroConta() {
                return numeroConta;
            }

            // SETTER (Apenas para o titular, como pedido)
            public void setTitular(String titular) {
                this.titular = titular;
            }

            @Override
            public String toString() {
                return "Conta [Titular: " + titular + ", Nº: " + numeroConta + ", Saldo: R$" + saldo + "]";
            }
        }

        //  Classe main
        public void main(String[] args) {
            // Chamando o construtor com os dados
            ContaBancaria conta1 = new ContaBancaria("Luiz", 1001);
            ContaBancaria conta2 = new ContaBancaria("João", 2002);

            // Testando as operações
            conta1.depositar(500);
            conta1.sacar(100);
            conta1.sacar(1000); // Deve dar erro de saldo insuficiente

            System.out.println(conta1.toString());
            System.out.println(conta2.toString());

        }

    }