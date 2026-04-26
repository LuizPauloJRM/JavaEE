package exercicios.testes;

import java.util.Optional;
import java.util.List;

/**
 * Interface de repositorio - sera MOCKADA nos testes.
 */
public interface UsuarioRepository {
    Optional<Usuario> buscarPorId(Long id);
    Optional<Usuario> buscarPorEmail(String email);
    List<Usuario> listarTodos();
    Usuario salvar(Usuario usuario);
    void deletar(Long id);
    boolean existePorEmail(String email);
}
