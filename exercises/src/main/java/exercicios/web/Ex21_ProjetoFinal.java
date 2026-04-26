package exercicios.web;

import java.util.*;

/**
 * =============================================
 * EXERCICIO 21 - PROJETO FINAL: SISTEMA DE GESTAO
 * =============================================
 * OBJETIVO:
 * Integrar os principais conceitos do curso em um mini sistema de biblioteca.
 *
 * O QUE A ATIVIDADE PEDE:
 * 1. Modele o dominio:
 *    - crie StatusLivro, Endereco, Livro, Pessoa, Membro e Funcionario;
 *    - em Livro, use equals/hashCode por isbn e Comparable por titulo;
 *    - em Membro, limite os emprestimos a 3 livros.
 * 2. Crie excecoes de negocio:
 *    - LivroNaoDisponivelException;
 *    - LimiteEmprestimoException;
 *    - LivroNaoEncontradoException.
 * 3. Persistencia em memoria:
 *    - defina LivroRepository;
 *    - implemente o repositorio com HashMap.
 * 4. Regras de negocio:
 *    - implemente BibliotecaService com emprestimo, devolucao, busca por autor
 *      e relatorios com Stream API.
 * 5. Demonstracao final:
 *    - cadastre livros e pessoas;
 *    - faca emprestimos e devolucoes;
 *    - trate erros com try/catch;
 *    - use polimorfismo, instanceof e relatorios.
 *
 * DETALHES IMPORTANTES:
 * - relatorioStatus() deve contar livros por status.
 * - livrosMaisEmprestados() deve ordenar pelo total de emprestimos.
 */
public class Ex21_ProjetoFinal {

    // Crie TODAS as classes aqui ou em arquivos separados

    public static void main(String[] args) {
        // Demonstre o sistema completo

    }
}
