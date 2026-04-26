package exercicios.testes;

import java.util.List;
import java.util.Optional;

/**
 * Service JA IMPLEMENTADO - voce vai TESTAR com Mockito.
 * Depende de UsuarioRepository e EmailService (serao mockados).
 */
public class UsuarioService {

    private final UsuarioRepository repository;
    private final EmailService emailService;

    public UsuarioService(UsuarioRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public Usuario criarUsuario(String nome, String email, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome nao pode ser vazio");
        }
        if (email == null || !emailService.emailValido(email)) {
            throw new IllegalArgumentException("Email invalido");
        }
        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("Idade invalida");
        }
        if (repository.existePorEmail(email)) {
            throw new IllegalStateException("Email ja cadastrado");
        }

        Usuario usuario = new Usuario(null, nome, email, idade);
        Usuario salvo = repository.salvar(usuario);

        emailService.enviarEmail(email, "Bem-vindo!", "Ola " + nome + ", sua conta foi criada!");

        return salvo;
    }

    public Usuario buscarPorId(Long id) {
        return repository.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Usuario nao encontrado: " + id));
    }

    public List<Usuario> listarTodos() {
        return repository.listarTodos();
    }

    public Usuario atualizarEmail(Long id, String novoEmail) {
        Usuario usuario = buscarPorId(id);

        if (!emailService.emailValido(novoEmail)) {
            throw new IllegalArgumentException("Email invalido");
        }
        if (repository.existePorEmail(novoEmail)) {
            throw new IllegalStateException("Email ja esta em uso");
        }

        usuario.setEmail(novoEmail);
        return repository.salvar(usuario);
    }

    public void deletarUsuario(Long id) {
        buscarPorId(id); // verifica se existe
        repository.deletar(id);
    }
}
