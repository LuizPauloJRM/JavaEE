package main.java.exercicios.oop;
//Classe abstrata
abstract class Funcionario {

    protected String nmFuncionario;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nmFuncionario = nmFuncionario;
        this.salarioBase = salarioBase;
    }

    public String getnmFuncionario() {
        return nmFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Método abstrato (cada tipo calcula diferente)
    public abstract double calcularSalario();

    // Método padrão (pode ser sobrescrito)
    public String getDescricao() {
        return "Funcionário: " + nmFuncionario;
    }
}

// CLT
class CLT extends Funcionario {

    // Construtor padrão
    public CLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // SOBRECARGA (overload)
    public CLT(String nome) {
        super(nome, 2000); // salário padrão
    }

    @Override
    public double calcularSalario() {
        // Exemplo: desconto de 10%
        return salarioBase * 0.9;
    }

    @Override
    public String getDescricao() {
        return "CLT: " + nmFuncionario;
    }
}

// PJ
class PJ extends Funcionario {

    public PJ(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // PJ recebe integral (sem desconto)
        return salarioBase;
    }

    @Override
    public String getDescricao() {
        return "PJ: " + nmFuncionario;
    }
}

// ESTAGIÁRIO
class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Exemplo: bolsa fixa (sem alteração)
        return salarioBase;
    }

    @Override
    public String getDescricao() {
        return "Estagiário: " + nmFuncionario + " (Bolsa)";
    }
}