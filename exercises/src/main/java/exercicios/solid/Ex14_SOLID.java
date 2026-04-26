package exercicios.solid;

import java.util.List;

/**
 * =============================================
 * EXERCICIO 14 - PRINCIPIOS SOLID
 * =============================================
 * OBJETIVO:
 * Identificar violacoes de SOLID e reorganizar o codigo em um desenho mais
 * coeso, extensivel e testavel.
 *
 * O QUE A ATIVIDADE PEDE:
 * 1. Analise o exemplo ruim e identifique onde cada principio esta sendo
 *    violado.
 * 2. Refatore o desenho separando responsabilidades, criando abstracoes e
 *    usando injecao de dependencias.
 * 3. Demonstre que o notificador pode ser trocado sem alterar a classe
 *    principal.
 *
 * PARA REVISAR:
 * - SRP, OCP, LSP, ISP e DIP.
 */

// === CODIGO RUIM - REFATORE! ===
/*
class GerenciadorDeUsuarios {
    // Viola S: faz TUDO (salvar, validar, enviar email, gerar relatorio)
    // Viola O: para adicionar novo tipo de notificacao, precisa MODIFICAR esta classe
    // Viola D: depende diretamente de implementacoes concretas

    public void salvarUsuario(String nome, String email) {
        // valida
        if (nome == null || email == null) throw new RuntimeException("Invalido");
        // salva no banco (implementacao direta)
        System.out.println("INSERT INTO usuarios...");
        // envia email (implementacao direta)
        System.out.println("Enviando email via SMTP...");
        // gera log
        System.out.println("Log: usuario salvo");
    }

    public String gerarRelatorio() {
        return "Relatorio de usuarios...";
    }
}
*/

/**
 * CONTINUACAO DA REFATORACAO:
 *
 * - Separe responsabilidades em classes menores, como validador, repositorio,
 *   servico de notificacao e servico de relatorio.
 * - Crie a interface Notificador e implementacoes como email, SMS e Slack.
 * - Evite interfaces inchadas: prefira contratos pequenos e especificos.
 * - Injete dependencias no construtor de GerenciadorDeUsuarios.
 * - Mostre que EmailNotificador e SmsNotificador podem ser trocados sem alterar
 *   a classe principal.
 */
public class Ex14_SOLID {

    // Refatore aqui

    public static void main(String[] args) {
        // Demonstre o codigo refatorado

    }
}
