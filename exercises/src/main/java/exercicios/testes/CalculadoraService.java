package exercicios.testes;

/**
 * Classe de suporte para os exercicios de testes.
 * Esta classe JA ESTA IMPLEMENTADA - voce vai TESTAR ela.
 */
public class CalculadoraService {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisao por zero nao permitida");
        }
        return (double) a / b;
    }

    public boolean ehPar(int n) {
        return n % 2 == 0;
    }

    public boolean ehPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public int fatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Numero negativo nao tem fatorial");
        if (n <= 1) return 1;
        return n * fatorial(n - 1);
    }
}
