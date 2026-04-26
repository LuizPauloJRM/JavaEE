/*
* Classe ContaBancaria com atributos
*Atributos PRIVADOS
* titular , saldo e nmConta
* */

public class ContaBancaria {
    //ATRIBUTOS
    private String nomeTitularConta;
    private BigDecimal saldo;
    private BigDecimal numeroConta;







    //Getters e Setters
    public String getNomeTitularConta() {
        return nomeTitularConta;
    }

    public void setNomeTitularConta(String nomeTitularConta) {
        this.nomeTitularConta = nomeTitularConta;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(BigDecimal numeroConta) {
        this.numeroConta = numeroConta;
    }
}