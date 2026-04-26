package exercicios.collections;

import java.util.Arrays;
import java.util.Comparator;

/**
 * =============================================
 * EXERCICIO 04 - ARRAYS E MATRIZES
 * =============================================
 * OBJETIVO:
 * Resolver exercicios com arrays, matrizes e ordenacao de objetos.
 *
 * O QUE A ATIVIDADE PEDE:
 * 1. Array de inteiros:
 *    - encontre maior e menor sem ordenar;
 *    - calcule a media;
 *    - conte pares e impares;
 *    - crie um novo array com valores acima da media;
 *    - inverta o conteudo do proprio array.
 * 2. Matriz 4x4:
 *    - imprima a matriz;
 *    - some linhas e colunas;
 *    - some as diagonais principal e secundaria;
 *    - encontre o maior valor e sua posicao;
 *    - gere a matriz transposta.
 * 3. Array de objetos:
 *    - crie Produto com nome e preco;
 *    - ordene por preco com Comparable;
 *    - ordene por nome com Comparator.
 *
 * PARA REVISAR:
 * - Diferenca entre array, matriz e colecoes dinamicas como ArrayList.
 */
public class Ex04_ArraysEMatrizes {

    // Crie a classe Produto aqui

    public static void main(String[] args) {
        // TAREFA 1 - A)
        int[] numeros = { 12, 5, 8, 1, 23, 7, 15, 3, 19, 10 };

        int maior = numeros[0];
        int menor = numeros[0];

        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        // TAREFA 1 - B)

        int soma = 0;

        for (int n : numeros) {
            soma += n;
        }

        double media = (double) soma / numeros.length;

        System.out.println("Media: " + media);

        // TAREFA 1 - C)

        int contPar = 0;
        int contImpar = 0;

        for (int n : numeros) {
            if (n % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        System.out.println("Quantidade de Pares: " + contPar);
        System.out.println("Quantidade de Impares: " + contImpar);

        // TAREFA 1 - D)

        int contador = 0;

        for (int n : numeros) {
            if (n > media) {
                contador++;
            }
        }

        int[] maioresQueMedia = new int[contador];

        int indice = 0;
        for (int n : numeros) {
            if (n > media) {
                maioresQueMedia[indice] = n;
                indice++;
            }
        }

        System.out.print("Numeros maiores que a média: ");
        for (int n : maioresQueMedia) {
            System.out.print(n + " ");
        }
        System.out.println();

        // TAREFA 1 - E)

        int fim = numeros.length - 1;

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[fim];
            numeros[fim] = temp;
            fim--;
        }

        System.out.print("Array invertido: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
        System.out.println();

        /*
         * PARTE 2 - MATRIZ 4x4:
         * - Imprima a matriz de forma organizada.
         * - Calcule as somas de cada linha e de cada coluna.
         * - Some diagonal principal e secundaria.
         * - Encontre o maior valor e sua posicao [linha][coluna].
         * - Monte a transposta trocando linhas por colunas.
         */

        int[][] matriz = {
                { 3, 2, 6, 9 },
                { 4, 5, 2, 1 },
                { 5, 0, 3, 8 },
                { 7, 0, 4, 6 }
        };

        // TAREFA 2 - A)

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // TAREFA 2 - B)

        int somaTarefa2B = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTarefa2B += matriz[i][j];
            }
        }
        System.out.println("Soma: " + somaTarefa2B);

        // TAREFA 2 - C)

        int somaDiagPrinc = 0;
        int contITarefa2C = 0, contJTarefa2C = 0;

        while (contITarefa2C < matriz.length && contJTarefa2C < matriz.length) {
            somaDiagPrinc += matriz[contITarefa2C][contJTarefa2C];
            contITarefa2C++;
            contJTarefa2C++;
        }

        System.out.println("Diagonal Principal: " + somaDiagPrinc);

        int somaDiagSecun = 0;
        contITarefa2C = 0;
        contJTarefa2C = matriz.length - 1;

        while (contITarefa2C < matriz.length && contJTarefa2C >= 0) {
            somaDiagSecun += matriz[contITarefa2C][contJTarefa2C];
            contITarefa2C++;
            contJTarefa2C--;
        }

        System.out.println("Diagonal Secundária: " + somaDiagSecun);

        // TAREFA 2 - D)

        int[][] transposta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * PARTE 3 - ARRAY DE OBJETOS:
         * Crie Produto (nome, preco) e ordene o array de 5 itens por preco com
         * Comparable e por nome com Comparator.
         */

        Produto[] produtos = new Produto[5];

        produtos[0] = new Produto("Notebook", 3500.0);
        produtos[1] = new Produto("Mouse", 50.0);
        produtos[2] = new Produto("Teclado", 120.0);
        produtos[3] = new Produto("Monitor", 900.0);
        produtos[4] = new Produto("Fone", 200.0);

        // 🔹 a) Ordenar por preço (Comparable)
        Arrays.sort(produtos);
        System.out.println("Ordenado por preço:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        // 🔹 b) Ordenar por nome (Comparator)
        Arrays.sort(produtos, new ComparadorNome());
        System.out.println("\nOrdenado por nome:");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }

    /*
     * PARTE 3 - ARRAY DE OBJETOS:
     * A classe Produto deve permitir ordenacao natural por preco e uma ordenacao
     * alternativa por nome usando Comparator.
     */

    public static class Produto implements Comparable<Produto> {
        String nome;
        double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        // Método usado para ordenar por preço
        @Override
        public int compareTo(Produto outro) {
            return Double.compare(this.preco, outro.preco);
        }

        @Override
        public String toString() {
            return nome + " - R$ " + preco;
        }
    }

    public static class ComparadorNome implements Comparator<Produto> {
        @Override
        public int compare(Produto p1, Produto p2) {
            return p1.nome.compareTo(p2.nome);
        }
    }
}
