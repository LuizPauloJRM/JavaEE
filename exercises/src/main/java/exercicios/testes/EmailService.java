package exercicios.testes;

/**
 * Interface de servico de email - sera MOCKADA nos testes.
 */
public interface EmailService {
    void enviarEmail(String destinatario, String assunto, String corpo);
    boolean emailValido(String email);
}
