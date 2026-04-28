package main.java.exercicios.oop;

public class Rh {

    public static void main() {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new CLT("Luiz", 3000);
        funcionarios[1] = new PJ("João", 5000);
        funcionarios[2] = new Estagiario("Maria", 1500);

        double totalFolha = 0;

        for (Funcionario f : funcionarios) {
            System.out.println(f.getDescricao());
            System.out.println("Salário final: R$ " + f.calcularSalario());
            System.out.println("----------------------------");

            totalFolha += f.calcularSalario();
        }

        System.out.println("TOTAL DA FOLHA: R$ " + totalFolha);
    }
}
