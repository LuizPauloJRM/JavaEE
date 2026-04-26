package exercicios.testes;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * =============================================
 * EXERCICIO 18 - JUNIT 5 BASICO
 * =============================================
 * OBJETIVO:
 * Escrever testes unitarios da CalculadoraService usando JUnit 5 e o padrao
 * AAA (Arrange, Act, Assert).
 *
 * O QUE A ATIVIDADE PEDE:
 * - Cubra os metodos de soma, divisao, numero primo, fatorial e paridade.
 * - Use assertions adequados, como assertEquals, assertThrows, assertTrue,
 *   assertFalse, assertAll, assertNotNull e assertInstanceOf.
 * - Mantenha cada @Test organizado em preparo, execucao e verificacao.
 * - Aproveite o setUp() com @BeforeEach para reutilizar a instancia da classe.
 *
 * EXECUCAO:
 * - mvn test -Dtest=Ex18_JUnitBasico
 */
class Ex18_JUnitBasico {

    private CalculadoraService calc;

    @BeforeEach
    void setUp() {
        calc = new CalculadoraService();
    }

    // === TESTES DE SOMA ===

    @Test
    @DisplayName("Deve somar dois numeros positivos")
    void deveSomarPositivos() {
        // Arrange (ja feito no setUp)
        // Act
        // Assert
        // Use: assertEquals(esperado, resultado)

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve somar com numero negativo")
    void deveSomarComNegativo() {
        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve somar com zero")
    void deveSomarComZero() {
        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // === TESTES DE DIVISAO ===

    @Test
    @DisplayName("Deve dividir corretamente")
    void deveDividir() {
        // Escreva seu codigo aqui
        // Use: assertEquals(esperado, resultado, delta) para doubles
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao ao dividir por zero")
    void deveLancarExcecaoDivisaoPorZero() {
        // Use: assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0))
        // Verifique tambem a mensagem da excecao

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // === TESTES DE PRIMO ===

    @Test
    @DisplayName("Deve identificar numeros primos")
    void deveIdentificarPrimos() {
        // Teste multiplos valores: 2, 3, 5, 7, 11
        // Use: assertTrue() e assertFalse()

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve rejeitar nao-primos")
    void deveRejeitarNaoPrimos() {
        // Teste: 0, 1, 4, 6, 8, 9, 10

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // === TESTES DE FATORIAL ===

    @Test
    @DisplayName("Deve calcular fatorial corretamente")
    void deveCalcularFatorial() {
        // assertAll permite testar MULTIPLOS asserts de uma vez
        // Se um falhar, os outros ainda executam
        assertAll(
            // () -> assertEquals(1, calc.fatorial(0)),
            // () -> assertEquals(1, calc.fatorial(1)),
            // ... adicione mais
        );

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    @Test
    @DisplayName("Deve lancar excecao para fatorial de negativo")
    void deveLancarExcecaoFatorialNegativo() {
        // Use assertThrows com IllegalArgumentException

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // === TESTE COM assertAll (multiplas verificacoes) ===

    @Test
    @DisplayName("Deve verificar paridade de multiplos numeros")
    void deveVerificarParidade() {
        // Use assertAll para verificar varios de uma vez:
        // assertAll(
        //     () -> assertTrue(calc.ehPar(2), "2 deveria ser par"),
        //     () -> assertFalse(calc.ehPar(3), "3 deveria ser impar"),
        //     ...
        // );

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }

    // === TESTE COM assertNotNull / assertNull ===

    @Test
    @DisplayName("Deve retornar instancia valida de CalculadoraService")
    void deveRetornarInstanciaValida() {
        // assertNotNull(calc);
        // assertInstanceOf(CalculadoraService.class, calc);

        // Escreva seu codigo aqui
        fail("Implemente este teste");
    }
}
