package exercicios.equals_hashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/**
 * =============================================
 * EXERCICIO 07 - EQUALS E HASHCODE
 * =============================================
 * OBJETIVO:
 * Entender por que equals() e hashCode() precisam ser implementados em
 * conjunto quando um objeto sera usado em Set ou Map.
 *
 * O QUE A ATIVIDADE PEDE:
 * 1. Mostre o problema:
 *    - crie Pessoa com nome e cpf;
 *    - compare duas instancias com o mesmo cpf sem sobrescrever nada;
 *    - adicione as duas em um HashSet e observe o comportamento incorreto.
 * 2. Implemente equals():
 *    - trate null, mesma referencia e mesma classe;
 *    - compare pessoas pelo cpf.
 * 3. Implemente hashCode():
 *    - use o mesmo campo usado em equals();
 *    - repita os testes anteriores e compare o resultado.
 * 4. Prove em um HashMap:
 *    - salve um valor usando uma Pessoa;
 *    - busque com outra instancia de mesmo cpf.
 * 5. Analise armadilhas:
 *    - hashCode fixo;
 *    - hashCode baseado em campo mutavel.
 *
 * PARA REVISAR:
 * - == compara referencia; equals() compara igualdade logica.
 * - Se equals() for true, hashCode() tambem precisa ser igual.
 */
public class Ex07_EqualsEHashCode {

    // Crie a classe Pessoa aqui

    public static void main(String[] args) {
        // TAREFA 1 - Sem equals/hashCode

        // TAREFA 2 e 3 - Com equals/hashCode

        // TAREFA 4 - HashMap

        // TAREFA 5 - Armadilhas

    }
}
